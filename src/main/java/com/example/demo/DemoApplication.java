package com.example.demo;
import org.springframework.boot.CommandLineRunner;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.UserEntity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

// DemoApplication.java 파일
@SpringBootApplication // 이 괄호 내용을 추가하세요!
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Bean
    public CommandLineRunner dataTest(UserRepository userRepository) {
        return args -> {
            System.out.println("========================================");
            System.out.println("🔍 데이터베이스 데이터 조회 시작...");

            // 모든 사용자 데이터 가져오기
            List<UserEntity> users = userRepository.findAll();

            if (users.isEmpty()) {
                System.out.println("현재 데이터베이스에 등록된 사용자가 없습니다.");
            } else {
                System.out.println("총 " + users.size() + "명의 사용자를 발견했습니다:");
                users.forEach(user -> {
                    System.out.printf("아이디: %-10s | 비밀번호: %-10s|성함: %-10s | 이메일: %s", 
                        user.getUserID(), user.getUserPW(),
                        user.getUserName(), user.getEmail());
                        System.out.printf("\n\"코드: %-10s,가입일:%-10s,잔액:%-10d",user.getUserCode(),user.getJoiningDay(),user.getDeposit());
                });
            }
            System.out.println("========================================");
        };
    }
}