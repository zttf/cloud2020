package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ${USER}
 * @title ${NAME}
 * @date ${DATE} ${TIME}
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerOrder83 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrder83.class,args);
    }
}

