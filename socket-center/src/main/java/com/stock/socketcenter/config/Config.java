package com.stock.socketcenter.config;

import com.stock.socketcenter.server.ImServer;
import com.stock.socketcenter.server.ImWebsocketServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    //初始化提示和销毁提示 two ：通过对bean对象进行注解的方式
    @Bean(initMethod ="init", destroyMethod = "destroy")
    public ImServer createImServer(){
        return new ImServer();
    }

    //初始化提示和销毁提示 two ：通过对bean对象进行注解的方式
    @Bean(initMethod ="init", destroyMethod = "destroy")
    public ImWebsocketServer createImWebsocketServer(){
        return new ImWebsocketServer();
    }
}
