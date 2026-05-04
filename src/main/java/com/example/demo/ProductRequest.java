package com.example.demo;

public class ProductRequest {
    private String title;    // 물품명
    private int price;       // 일일 대여료
    private String category; // 카테고리 (도서, 가전 등)
    private String location; // 대여 지역 (신동, 모현동 등)
    private String imageUrl; // 이미지 경로

    public ProductRequest() {}

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
