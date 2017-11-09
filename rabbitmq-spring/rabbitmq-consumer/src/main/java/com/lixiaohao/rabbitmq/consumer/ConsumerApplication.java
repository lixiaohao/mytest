package com.lixiaohao.rabbitmq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by xiaohao.li on 2017/9/19.
 */
@SpringBootApplication //
@Configuration
//@ComponentScan(basePackages = {"com.lixiaohao.rabbitmq.consumer"})
@ImportResource({"classpath:applicationContext.xml"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
