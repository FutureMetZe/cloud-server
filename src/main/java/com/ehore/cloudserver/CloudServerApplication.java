package com.ehore.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer//服务注册中心
public class CloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerApplication.class, args);
    }
}
