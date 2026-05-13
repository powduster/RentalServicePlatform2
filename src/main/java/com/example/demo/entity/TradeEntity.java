package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "Trade")
@Getter @Setter
@NoArgsConstructor
public class TradeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TradeID")
    private Long tradeId;

    @Column(name = "ItemId")
    private Long itemId; // ItemInfo의 PK 참조

    @Column(name = "LenderID", length = 50)
    private String lenderId; // UserInfo의 UserID 참조

    @Column(name = "BorrowerID", length = 50)
    private String borrowerId; // UserInfo의 UserID 참조

    @Column(name = "LendingTime")
    private LocalDateTime lendingTime;

    @Column(name = "ReturningTime")
    private LocalDateTime returningTime;

    @Column(name = "ItemReturn")
    private Boolean itemReturn = false;

    @Column(name = "Damaged")
    private Boolean damaged = false;

    @Column(name = "price")
    private Integer price;
}