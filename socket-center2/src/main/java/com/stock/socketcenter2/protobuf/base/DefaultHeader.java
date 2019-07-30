package com.stock.socketcenter2.protobuf.base;


import com.stock.socketcenter2.config.SysConstant;
import com.stock.socketcenter2.support.SequenceNumberMaker;

public class DefaultHeader extends Header {

    public DefaultHeader(int serviceId, int commandId) {
        setVersion((short) SysConstant.PROTOCOL_VERSION);
        setFlag((short) SysConstant.PROTOCOL_FLAG);
        setServiceId((short)serviceId);
        setCommandId((short)commandId);
        short seqNo = SequenceNumberMaker.getInstance().make();
        setSeqnum(seqNo);
        setReserved((short)SysConstant.PROTOCOL_RESERVED);
    }
}
