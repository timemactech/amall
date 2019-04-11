package com.timemac.amall.platform.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ivanyu
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FrontGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontGatewayApplication.class, args);
    }

}
