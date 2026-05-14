package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor

@Entity
public class UserEntity{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserCode")
    private Integer userCode;
    
    @Column(name = "UserID",length = 50)
    private String userID;

    @Column(name = "UserPW",length = 255)
    private String userPW;

    @Column(name = "UserName",length = 50)
    private String userName;

    @Column(name = "Email",length = 50)
    private String email;

    @Column(name = "JoiningDay")
    private LocalDateTime joiningDay;

    @Column(name = "Deposit")
    private Integer deposit;
}