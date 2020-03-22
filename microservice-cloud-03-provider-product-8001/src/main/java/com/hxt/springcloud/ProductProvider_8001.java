package com.hxt.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hxt.springcloud.mapper") //扫描所有Mapper接口
public class ProductProvider_8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001.class,args);
    }
}
