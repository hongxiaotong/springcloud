package com.hxt.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther:hxt 自定义配置类
 */
@Configuration
public class ConfigBean {

    // 向容器中添加 RestTemplate 组件,直接通过此组件可调用 REST 接口
    @Bean
    //负载均衡
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
