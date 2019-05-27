package com.stock.stockday.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@Data
public class UrlConfig {
    @Value("${stock-url}")
    private String stockUrl;
    @Value("${stock-url2}")
    private String stockUrl2;
    @Value("${stock-science-url}")
    private String stockScienceUrl;

}
