package com.stock.socketcenter2.server;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageV3;
import com.stock.socketcenter2.callback.ListenerQueue;
import com.stock.socketcenter2.callback.Packetlistener;
import com.stock.socketcenter2.config.SysConstant;
import com.stock.socketcenter2.protobuf.IMBaseDefine;
import com.stock.socketcenter2.protobuf.IMMessage;
import com.stock.socketcenter2.protobuf.IMOther;
import com.stock.socketcenter2.protobuf.MessageEntity;
import com.stock.socketcenter2.protobuf.base.DataBuffer;
import com.stock.socketcenter2.protobuf.base.DefaultHeader;
import com.stock.socketcenter2.protobuf.base.Header;
import com.stock.socketcenter2.protobuf.helper.ProtoBuf2JavaBean;
import com.stock.socketcenter2.support.JsonKit;
import com.stock.socketcenter2.support.MsgServerHandler;
import com.stock.socketcenter2.support.SocketThread;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBufferInputStream;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

public class IMMsgServerManager {
	private static IMMsgServerManager inst = new IMMsgServerManager();
	public static IMMsgServerManager instance() {
	        return inst;
	}
	private SocketThread msgServerThread;
    private ListenerQueue listenerQueue = ListenerQueue.instance();
	Timer timer = new Timer();
	
	/*
	 * 初始化心跳方法.心跳不能出现异常
	 */
	public void initHeartBeat() {
		 timer.schedule(new TimerTask() {
			public void run() {
            	 try
            	 {
            		 if(msgServerThread.isAlive())
                	 {
                    	 sendHeartBeatPacket();
                	 }
                	 else
                	 {
                		 initConnectHttpServer();
                	 }
            	 }
            	 catch(Exception e){}
             }
           },IMWebSocketServerConfig.instance().HEARTBEAT_TIMEOUT,IMWebSocketServerConfig.instance().HEARTBEAT_TIMEOUT);
	}
	
	/*
	 * 发送心跳包到HttpMsgServer,以保持与HttpMsgServer的活跃。
	 */
    public void sendHeartBeatPacket(){
        try {
        	IMOther.IMHeartBeat imHeartBeat = IMOther.IMHeartBeat.newBuilder()
                    .build();
            int sid = IMBaseDefine.ServiceID.SID_OTHER_VALUE;
            int cid = IMBaseDefine.OtherCmdID.CID_OTHER_HEARTBEAT_VALUE;
            sendRequestToMsgServer(imHeartBeat,sid,cid,new Packetlistener(IMWebSocketServerConfig.instance().HEARTBEAT_TIMEOUT) {
                @Override
                public void onSuccess(Object response) {
                }
                @Override
                public void onFaild() {
                	initConnectHttpServer(); //连接错误，重新链接
                }

                @Override
                public void onTimeout() {
                	initConnectHttpServer();//超时。重新连接
                }
            });
        } finally {}
    }
    
	/*
	 * 初始化与HttpMsgServer的链接。
	 */
	public void initConnectHttpServer(){
	        //check again,may be unimportance
	        if (msgServerThread != null) {
	            msgServerThread.close();
	            msgServerThread = null;
	        }
	        String ip=IMWebSocketServerConfig.instance().HttpMsgServer;
	        msgServerThread = new SocketThread(IMWebSocketServerConfig.instance().HttpMsgServer, IMWebSocketServerConfig.instance().HttpMsgServerPort,new MsgServerHandler());
	        msgServerThread.start();
	}
		
	/*
	 * 转发到HttpMsgServer
	 */
   public void sendRequestToMsgServer(GeneratedMessageV3 requset, int sid, int cid, Packetlistener packetlistener){
	        int seqNo = 0;
	        try{
	            //组装包头 header
	            Header header = new DefaultHeader(sid, cid);
	            int bodySize = requset.getSerializedSize();
	            header.setLength(SysConstant.PROTOCOL_HEADER_LENGTH + bodySize);
	            seqNo = header.getSeqnum();
	            listenerQueue.push(seqNo,packetlistener);
	            boolean sendRes = msgServerThread.sendRequest(requset,header);
	        }catch (Exception e){
	        	if(packetlistener !=null){
	                packetlistener.onFaild();
	            }
	        	listenerQueue.pop(seqNo);
	        }
   }
	 
     /*
      * 解析包
      */
	 public void packetDispatch(ChannelBuffer channelBuffer){
	        DataBuffer buffer = new DataBuffer(channelBuffer);
	        Header header = new Header();
	        header.decode(buffer);
	        /**buffer 的指针位于body的地方*/
	        int commandId = header.getCommandId();
	        int serviceId = header.getServiceId();
	        int seqNo = header.getSeqnum();
	        System.out.println(commandId+"-"+serviceId);
	        
	        CodedInputStream codedInputStream = CodedInputStream.newInstance(new ChannelBufferInputStream(buffer.getOrignalBuffer()));
	        switch (serviceId){
	            case IMBaseDefine.ServiceID.SID_MSG_VALUE:
	                msgPacketDispatcher(commandId,codedInputStream);
	                break;
	            default:
	    	        Packetlistener listener = listenerQueue.pop(seqNo);
	    	        if(listener!=null){
	    	             listener.onSuccess(codedInputStream);
	    	             return;
	    	        }
	                break;
	        }

	 }
	    
	 /*
	  * 聊天消息解析
	  */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void msgPacketDispatcher(int commandId, CodedInputStream buffer){
	        try {
	        switch (commandId) {
	            case  IMBaseDefine.MessageCmdID.CID_MSG_DATA_ACK_VALUE:
	                // have some problem  todo
	            return;

	            case IMBaseDefine.MessageCmdID.CID_MSG_LIST_RESPONSE_VALUE:
	                IMMessage.IMGetMsgListRsp rsp = IMMessage.IMGetMsgListRsp.parseFrom(buffer);
	            return;

	            case IMBaseDefine.MessageCmdID.CID_MSG_DATA_VALUE:
	                IMMessage.IMMsgData imMsgData = IMMessage.IMMsgData.parseFrom(buffer);
	                MessageEntity recvMessage = ProtoBuf2JavaBean.getMessageEntity(imMsgData);
	                String msg= JsonKit.toJSONString(recvMessage);
	                int toUserId=imMsgData.getToUserId()>0?imMsgData.getToUserId():imMsgData.getToSessionId();
	                
	                Hashtable remsg=new Hashtable();
	                remsg.put("serviceID", IMBaseDefine.ServiceID.SID_MSG_VALUE);
	                remsg.put("commandID", IMBaseDefine.ServiceID.SID_MSG_VALUE);
	                remsg.put("content",recvMessage.getContent());
	                remsg.put("fromId",recvMessage.getFromId());
	                remsg.put("toId",toUserId);
	                remsg.put("sessionType",recvMessage.getSessionType());
	                remsg.put("toSessionId",imMsgData.getToSessionId());
	                remsg.put("msgType",recvMessage.getMsgType());
	                remsg.put("msgId",recvMessage.getMsgId());
	                remsg.put("created",recvMessage.getCreated());
	                
	                msg=JsonKit.toJSONString(remsg);
	                
	                IMWebSocketManager.instance().sendMessageToWebClient(toUserId+"",msg);
	            
	                return;

	            case IMBaseDefine.MessageCmdID.CID_MSG_READ_NOTIFY_VALUE:
	                IMMessage.IMMsgDataReadNotify readNotify = IMMessage.IMMsgDataReadNotify.parseFrom(buffer);
	                return;
	            case IMBaseDefine.MessageCmdID.CID_MSG_UNREAD_CNT_RESPONSE_VALUE:
	                IMMessage.IMUnreadMsgCntRsp unreadMsgCntRsp = IMMessage.IMUnreadMsgCntRsp.parseFrom(buffer);
	                return;

	            case IMBaseDefine.MessageCmdID.CID_MSG_GET_BY_MSG_ID_RES_VALUE:
	                IMMessage.IMGetMsgByIdRsp getMsgByIdRsp = IMMessage.IMGetMsgByIdRsp.parseFrom(buffer);
	                break;
	        }
	        } catch (IOException e) {
	        }
	    }
	    
	

}
