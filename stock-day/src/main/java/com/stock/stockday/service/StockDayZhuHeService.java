package com.stock.stockday.service;

import java.io.IOException;

public interface StockDayZhuHeService {
    boolean getZhuHeBenpan() throws IOException;
    boolean getZhuHeDapan() throws IOException;
    boolean getChunJiShu() throws IOException;
    boolean getChunTuXing() throws IOException;
}
