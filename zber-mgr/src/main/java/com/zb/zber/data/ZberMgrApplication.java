package com.zb.zber.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@MapperScan("com.zb.zber.data.mapper")
public class ZberMgrApplication {
    public static void main(String[] args) {
//        SpringApplication springApplication = new SpringApplication(YwythApplication.class);
//        springApplication.addListeners(new ApplicationStartup());
        SpringApplication.run(ZberMgrApplication.class, args);
    }
}
