package com.stock.stockday.service;

import java.io.IOException;
import java.text.ParseException;

public interface StockDayFundFlowService {
    boolean getAllFundFlow() throws IOException, ParseException;
}
