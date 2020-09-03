package com.jlu.seckilling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.jlu.seckilling.mapper")
@SpringBootApplication
public class SeckillingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillingApplication.class, args);
    }

}
