package com.stock.stockday.service;


import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;

public interface StockDayService {
    boolean getAllDate() throws IOException, ParseException;
}
