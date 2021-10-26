package com.zhuyytt.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 *
 * @author zhuyytt
 * @date 2021/20/26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CloudTestCustomerApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudTestCustomerApplication9001.class, args);
    }

}
