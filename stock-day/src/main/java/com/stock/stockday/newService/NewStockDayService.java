package com.stock.stockday.newService;

import java.io.IOException;

public interface NewStockDayService {
    String getNewFile() throws IOException;

    String getKTu20LS() throws IOException;

    String getKTu20S() throws IOException;

    String getKTu20L() throws IOException;

    String getKMAQ20() throws IOException;
}
