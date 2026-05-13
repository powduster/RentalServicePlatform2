package com.example.demo;
import org.springframework.boot.CommandLineRunner;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.UserEntity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

// DemoApplication.java 파일
@SpringBootApplication // 이 괄호 내용을 추가하세요!
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}