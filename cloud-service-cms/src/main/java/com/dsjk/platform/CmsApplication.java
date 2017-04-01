package com.dsjk.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.dsjk.platform.cms.mapper", annotationClass = Repository.class)
public class CmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }
}
