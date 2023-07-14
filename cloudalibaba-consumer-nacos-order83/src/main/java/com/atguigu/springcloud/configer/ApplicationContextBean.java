package com.atguigu.springcloud.configer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextBean
{
    @Bean
    @LoadBalanced  //负载均衡的注解
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}