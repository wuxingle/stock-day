package com.stock.socketcenter2.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.tio.core.ChannelContext;
import org.tio.core.Tio;
import org.tio.http.common.HttpRequest;
import org.tio.http.common.HttpResponse;
import org.tio.websocket.common.WsRequest;
import org.tio.websocket.common.WsSessionContext;
import org.tio.websocket.server.handler.IWsMsgHandler;

/**
 * @author tanyaowu
 * 2017年6月28日 下午5:32:38
 */

@Component
public class IMWebSocketWsMsgHandler implements IWsMsgHandler {
	private static Logger log = LoggerFactory.getLogger(IMWebSocketWsMsgHandler.class);
    /**底层socket*/
	public static final IMWebSocketWsMsgHandler me = new IMWebSocketWsMsgHandler();
	
	private IMWebSocketWsMsgHandler() {
		
	}

	/**
	 * 握手时走这个方法，业务可以在这里获取cookie，request参数等
	 */
	@Override
	public HttpResponse handshake(HttpRequest request, HttpResponse httpResponse, ChannelContext channelContext) throws Exception {
		return httpResponse;
	}
	
	/**
	 * @param httpRequest
	 * @param httpResponse
	 * @param channelContext
	 * @throws Exception
	 * @author tanyaowu
	 */
	@Override
	public void onAfterHandshaked(HttpRequest httpRequest, HttpResponse httpResponse, ChannelContext channelContext) throws Exception {
	}
	
	/**
	 * 字节消息（binaryType = arraybuffer）过来后会走这个方法
	 */
	@Override
	public Object onBytes(WsRequest wsRequest, byte[] bytes, ChannelContext channelContext) throws Exception {
		return null;
	}
	
	/**
	 * 当客户端发close flag时，会走这个方法
	 */
	@Override
	public Object onClose(WsRequest wsRequest, byte[] bytes, ChannelContext channelContext) throws Exception {
	
		Tio.remove(channelContext, "receive close flag");
		return null;
	}

	/*
	 * 字符消息（binaryType = blob）过来后会走这个方法
	 */
	@Override
	public Object onText(WsRequest wsRequest, String text, ChannelContext channelContext) throws Exception {
		WsSessionContext wsSessionContext = (WsSessionContext) channelContext.getAttribute();
		HttpRequest httpRequest = wsSessionContext.getHandshakeRequestPacket();//获取websocket握手包
		if (text.contains("心跳")) {
			return null;
		}
		
		IMWebSocketManager.instance().setgroupContext(channelContext.groupContext);
		IMWebSocketManager.instance().parseWebClientCMD(text,channelContext);
		
		return null;
	}
	
}
