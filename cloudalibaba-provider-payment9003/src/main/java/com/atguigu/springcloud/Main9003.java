package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ${USER}
 * @title ${NAME}
 * @date ${DATE} ${TIME}
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main9003 {
    public static void main(String[] args) {
        SpringApplication.run(Main9003.class,args);
    }
}