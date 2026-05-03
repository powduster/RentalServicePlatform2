package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home") // 브라우저에 입력할 주소입니다.
    public String home() {
        return "main"; // templates 폴더에 넣은 HTML 파일 이름 (확장자 .html 제외)
    }
}