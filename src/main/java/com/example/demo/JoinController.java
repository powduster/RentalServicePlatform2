package com.example.demo;

import com.example.demo.JoinRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class JoinController {

    @PostMapping("/api/join")
    public ResponseEntity<?> join(@RequestBody JoinRequest joinData) {
        // 지금은 DB가 없으니 콘솔에 찍어서 확인
        System.out.println("회원가입 요청 아이디: " + joinData.getId());
        System.out.println("회원가입 요청 이름: " + joinData.getName());

        Map<String, String> response = new HashMap<>();
        response.put("message", joinData.getName() + "님, 회원가입이 완료되었습니다!");

        return ResponseEntity.ok(response);
    }
}
