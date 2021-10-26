package com.zhuyytt.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 *
 * @author zhuyytt
 * @date 2021/10/26
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudTestEurekaApplication7001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudTestEurekaApplication7001.class, args);
    }

}
