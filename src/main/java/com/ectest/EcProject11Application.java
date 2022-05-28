package com.ectest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ectest.mapper")
@SpringBootApplication
public class EcProject11Application {

    public static void main(String[] args) {
        SpringApplication.run(EcProject11Application.class, args);
    }

}
