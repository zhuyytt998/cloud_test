package com.zhuyytt.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 *
 * @author zhuyytt
 * @date 2021/10/26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@MapperScan("com.zhuyytt.provider.mapper")
public class CloudTestProviderApplication8081 {

    public static void main(String[] args) {
        SpringApplication.run(CloudTestProviderApplication8081.class, args);
    }

}
