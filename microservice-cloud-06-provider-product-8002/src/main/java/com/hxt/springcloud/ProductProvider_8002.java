package com.hxt.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.hxt.springcloud.mapper") //扫描所有Mapper接口
@EnableEurekaClient
public class ProductProvider_8002 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8002.class,args);
    }
}
