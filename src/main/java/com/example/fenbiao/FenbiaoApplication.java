package com.example.fenbiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = { "com.example.fenbiao" })
public class FenbiaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FenbiaoApplication.class, args);
    }

}
