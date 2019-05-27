package com.stock.cmsweb.server.impl;

import com.stock.apicommon.model.ResultData;
import com.stock.cmsweb.remote.StockDayRemoteClient;
import com.stock.cmsweb.server.StockDayListServer;
import com.stock.cmsweb.vo.StockDayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockDayListServerImpl implements StockDayListServer {
    @Autowired
    private StockDayRemoteClient stockDayRemoteClient;
    @Override
    public List<StockDayVo> getStockDayList() {
        ResultData<List<StockDayVo>> resultData=stockDayRemoteClient.getListStock();
        if (resultData.getCode()==200) {
            List<StockDayVo> stockDayVoList = resultData.getData();
            return stockDayVoList;
        }
        return null;
    }
}
