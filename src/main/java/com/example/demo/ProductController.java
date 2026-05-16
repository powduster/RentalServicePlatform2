package com.example.demo;

import com.example.demo.ProductRequest;
import com.example.demo.ProductResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    // 서버 메모리에 물품을 임시 저장할 리스트입니다. (DB 연동 전까지 사용)
    private static List<ProductResponse> tempStorage = new ArrayList<>();

    // 1. 물품 목록 조회 (GET)
    @GetMapping("/api/products")
    public List<ProductResponse> getProducts() {
        // 리스트가 비어있을 때만 기본 데이터를 넣어줍니다.
        if (tempStorage.isEmpty()) {
            tempStorage.add(new ProductResponse(1L, "[신동] 경제학 원론", "admin", "book", "신동", 5000, "https://images.unsplash.com/photo-1592492159418-39f319320569?w=400"));
            tempStorage.add(new ProductResponse(2L, "[모현동] 아이패드 에어 5", "익산앱등이", "tech", "모현동", 20000, "https://images.unsplash.com/photo-1544244015-0df4b3ffc6b0?w=400"));
        }
        return tempStorage;
    }

    // 2. 물품 등록하기 (POST)
    @PostMapping("/api/products")
    public String createProduct(@RequestBody ProductRequest request) {
        // 사용자가 보낸 ProductRequest 상자를 열어서 ProductResponse 형식으로 변환해 저장합니다.
        Long newId = System.currentTimeMillis(); // 현재 시간을 ID로 사용

        ProductResponse newProduct = new ProductResponse(
                newId,
                request.getTitle(),
                "현재사용자", // 나중에 로그인한 닉네임으로 바꿀 예정입니다.
                request.getCategory(),
                request.getLocation(),
                request.getPrice(),
                request.getImageUrl()
        );

        tempStorage.add(newProduct);
        return "물품 등록 성공! ID: " + newId;
    }

        // 3. 물품 상세 조회 (GET)
        @GetMapping("/api/products/{id}")
        public ProductResponse getProductDetail(@PathVariable("id") Long id) {
            return tempStorage.stream()
                    .filter(product -> product.getId().equals(id))
                    .findFirst()
                    .orElse(null);
        }
    }