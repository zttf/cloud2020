package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ${USER}
 * @title ${NAME}
 * @date ${DATE} ${TIME}
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix    // 这个注解里面有@EnableCircuitBreaker
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}