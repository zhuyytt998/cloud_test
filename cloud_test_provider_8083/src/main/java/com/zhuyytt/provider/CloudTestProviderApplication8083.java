package com.zhuyytt.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudTestProviderApplication8083 {

    public static void main(String[] args) {
        SpringApplication.run(CloudTestProviderApplication8083.class, args);
    }

}
