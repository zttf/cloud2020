package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author dale
 * @title GatewayConfig
 * @date 2023/6/13 21:47
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu",r ->r.path("/anime").uri("https://www.bilibili.com/anime")).build();
        routes.route("path_route_atguigu",r ->r.path("/v/game").uri("https://www.bilibili.com/v/game")).build();
        return routes.build();
    }
}
