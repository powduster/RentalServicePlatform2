package com.example.demo;

import com.example.demo.ProductResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/api/products")
    public List<ProductResponse> getProducts() {
        List<ProductResponse> products = new ArrayList<>();

        // 가짜 데이터 추가
        products.add(new ProductResponse(1L, "[신동] 경제학 원론", "admin", "book", "신동", 5000, "https://images.unsplash.com/photo-1592492159418-39f319320569?w=400"));
        products.add(new ProductResponse(2L, "[모현동] 아이패드 에어 5", "익산앱등이", "tech", "모현동", 20000, "https://images.unsplash.com/photo-1544244015-0df4b3ffc6b0?w=400"));
        products.add(new ProductResponse(3L, "[영등동] 캠핑 텐트", "캠핑족", "leisure", "영등동", 12000, "https://images.unsplash.com/photo-1504280390367-361c6d9f38f4?w=400"));

        return products;
    }
}
