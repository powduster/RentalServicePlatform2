package com.example.demo;

public class User {
    private String admin;  // 아이디
    private String number; // 비밀번호
    private int balance = 100000;

    public User(String admin, String number, int balance) {
        this.admin = admin;   // 외부에서 받은 admin을 진짜 변수에 저장
        this.number = number; // 외부에서 받은 number를 진짜 변수에 저장
        this.balance = balance;
    }

    public int getBalance() { return balance; }
    public void setBalance(int balance) { this.balance = balance; }
}