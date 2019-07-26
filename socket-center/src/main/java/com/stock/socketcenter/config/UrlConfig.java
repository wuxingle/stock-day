package com.stock.socketcenter.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@Data
public class UrlConfig {
    @Value("${config.imServer_port}")
    private int imServerPort;
    @Value("${config.imWebsocketServer_port}")
    private int imWebsocketServerPort;
    @Value("${config.rebotProxy_apiUrl}")
    private String rebotProxyApiUrl;
    @Value("${config.key}")
    private String key;
    @Value("${config.secret}")
    private String secret;

}
