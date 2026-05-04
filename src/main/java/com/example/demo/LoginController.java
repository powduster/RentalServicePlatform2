package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
        String id = loginData.get("id");
        String pw = loginData.get("pw");

        // 가짜 데이터로 로그인 체크 (나중에 DB 연결할 부분)
        if ("admin".equals(id) && "1234".equals(pw)) {
            Map<String, Object> response = new HashMap<>();
            response.put("id", "admin");
            response.put("name", "운영자");
            response.put("deposit", 100000);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 실패");
        }
    }









}
