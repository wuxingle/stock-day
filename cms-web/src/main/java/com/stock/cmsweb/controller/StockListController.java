package com.stock.cmsweb.controller;

import com.stock.apicommon.model.ResultData;
import com.stock.cmsweb.server.StockDayListServer;
import com.stock.cmsweb.vo.StockDayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller()
@RequestMapping("/web/v1")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class StockListController {
    @Autowired
    private StockDayListServer stockDayListServer;

    @GetMapping("/getStockDayList")
    @ResponseBody
    public ResultData<List<StockDayVo>> getStockDayList(){
        List<StockDayVo> stockDayVoList=stockDayListServer.getStockDayList();
        return new ResultData<>(stockDayVoList);
    }
}
