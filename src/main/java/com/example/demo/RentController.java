package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class RentController {

    // 기존에 만든 admin 계정 연결
    private User adminUser = new User("admin", "1234", 100000);

    @GetMapping("/api/user/balance")
    public int getBalance() {
        return adminUser.getBalance();
    }

    @PostMapping("/api/rent/{price}")
    public String rentProduct(@PathVariable int price) {
        // 1. admin 계정의 잔액 확인
        if (adminUser.getBalance() < price) {
            return "잔액이 부족합니다! 현재 잔액: " + adminUser.getBalance() + "원";
        }

        // 2. 잔액 차감
        adminUser.setBalance(adminUser.getBalance() - price);

        // 3. 결과 반환
        return "대여 성공! admin님의 남은 잔액: " + adminUser.getBalance() + "원";
    }
}
