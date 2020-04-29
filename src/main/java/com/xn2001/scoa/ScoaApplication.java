package com.xn2001.scoa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xn2001.scoa.mapper")
public class ScoaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoaApplication.class, args);
    }

}
