package com.stock.cmsweb.remote;

import com.stock.apicommon.model.ResultData;
import com.stock.cmsweb.vo.StockDayVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient("stock-day")
public interface StockDayRemoteClient {
    @GetMapping(value = "/day/v1/listStock")
    ResultData<List<StockDayVo>> getListStock();

}
