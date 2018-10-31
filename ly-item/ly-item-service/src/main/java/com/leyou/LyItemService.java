package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *@EnableEurekaClient:如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient
 *@EnableDiscoveryClient：如果是其他的注册中心，推荐使用@EnableDiscoveryClient。
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LyItemService {
    public static void main(String[] args) {
        SpringApplication.run(LyItemService.class, args);
    }
}