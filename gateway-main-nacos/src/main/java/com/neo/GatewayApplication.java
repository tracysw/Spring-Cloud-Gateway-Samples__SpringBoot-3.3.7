package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 然后本地启动gateway-main-nacos、user-service、user-service-1。 
 * 访问 http://localhost:8888/user/hello，多次访问发现会返回 hello world user! 或者 hello world user,another!。达到负载均衡的效果。 
 * 访问这个地址也可以看到同样的效果， 
 * http://localhost:8888/user01/hello。两个url不用的路由匹配规则。
 * 
 * @author shaowei
 * @date 2025年1月10日
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
