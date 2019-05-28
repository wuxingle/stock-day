package com.stock.stockday.service;

import java.io.IOException;

public interface StockDayProphesyService {
    boolean getProphesyProbability1() throws IOException;
    boolean getZhuHe24() throws IOException;
    boolean getZhuHe33() throws IOException;
    boolean getZhuHe42() throws IOException;
}
