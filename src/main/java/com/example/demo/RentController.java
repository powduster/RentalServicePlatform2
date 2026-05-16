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

    @PostMapping("/api/rent/{id}")
    public String rentProduct(@PathVariable Long id) {
        // 1. ProductController에 있는 임시 저장소에서 해당 ID 물품 찾기
        ProductResponse product = ProductController.tempStorage.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);

        if (product == null) return "존재하지 않는 물품입니다.";

        // 2. 이미 대여 중인지 확인
        if (product.isRented()) return "이미 대여 중인 물품입니다.";

        // 3. 잔액 확인 (물품의 실제 가격 사용)
        if (adminUser.getBalance() < product.getPrice()) return "잔액이 부족합니다.";

        // 4. 대여 처리 (잔액 차감 + 물품 상태 변경)
        adminUser.setBalance(adminUser.getBalance() - product.getPrice());
        product.setRented(true);

        return product.getTitle() + " 대여 성공! 잔액: " + adminUser.getBalance();
    }
}
