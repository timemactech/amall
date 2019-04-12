package com.timemac.amall.order.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@EnableDubbo(scanBasePackages = "com.timemac.amall.order.action")
@PropertySource("classpath:/spring/dubbo-consumer.properties")
@ComponentScan(value = {"com.timemac.amall.pay.service"})
public class ConsumerConfiguration {

}
