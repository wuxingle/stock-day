package com.stock.socketcenter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SocketCenter2Application {

    public static void main(String[] args) {
        SpringApplication.run(SocketCenter2Application.class, args);
    }

}
