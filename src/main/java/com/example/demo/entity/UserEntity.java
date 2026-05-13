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

@Getter @Setter  // Getter와 Setter 자동 생성
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

    @Column(name = "JoiningDay") // SQL에서 만든 이름과 맞춰주세요
    private LocalDateTime joiningDay; // TimeStamp 대신 LocalDateTime 권장

    @Column(name = "Deposit") // SQL의 Deposit과 매핑
    private Integer deposit; // SQL에서 int로 만들었으므로 Integer 사용
}