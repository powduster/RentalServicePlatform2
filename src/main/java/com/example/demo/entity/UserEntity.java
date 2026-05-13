package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter  // Getter와 Setter 자동 생성
@NoArgsConstructor

@Entity
public class UserEntity{

  @Id
    @Column(name = "UserID") // DB의 컬럼명과 매핑
    private String userID;

    @Column(name = "UserPW")
    private String userPW;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "Email")
    private String email;

    @Column(name = "JoiningDay") // SQL에서 만든 이름과 맞춰주세요
    private LocalDateTime joiningDay; // TimeStamp 대신 LocalDateTime 권장

    @Column(name = "Deposit") // SQL의 Deposit과 매핑
    private Integer deposit; // SQL에서 int로 만들었으므로 Integer 사용
}