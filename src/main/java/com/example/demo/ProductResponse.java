package com.example.demo;

public class ProductResponse {
    private Long id;
    private String title;
    private String owner;
    private String category;
    private String location;
    private int price;
    private int deposit;
    private String imageUrl;
    private boolean isRented = false; // 기본값 대여 가능

    public ProductResponse(Long id, String title, String owner, String category, String location, int price, String imageUrl) {
        this.id = id;
        this.title = title;
        this.owner = owner;
        this.category = category;
        this.location = location;
        this.price = price;
        this.deposit = (int)(price * 0.2); // 보증금은 대여료의 20%로 자동 계산
        this.imageUrl = imageUrl;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getOwner() { return owner; }
    public String getCategory() { return category; }
    public String getLocation() { return location; }
    public int getPrice() { return price; }
    public int getDeposit() { return deposit; }
    public String getImageUrl() { return imageUrl; }
    public boolean isRented() { return isRented; }
    public void setRented(boolean rented) { isRented = rented; }
}
