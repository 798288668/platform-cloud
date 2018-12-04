package com.cheng.platform.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.cheng"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.cheng"})
//@EnableCircuitBreaker
//@EnableHystrixDashboard
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
