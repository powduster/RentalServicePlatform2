package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// DemoApplication.java 파일
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // 이 괄호 내용을 추가하세요!
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
