package com.zhuyytt.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 *
 * @author zhuyytt
 * @date 2021/10/26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients
@MapperScan("com.zhuyytt.provider.mapper")
public class CloudTestProviderApplication8082 {

    public static void main(String[] args) {
        SpringApplication.run(CloudTestProviderApplication8082.class, args);
    }

}
