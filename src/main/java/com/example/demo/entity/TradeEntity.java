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
    private Long itemId;

    @Column(name = "LenderID")
    private Integer lenderId; 

    @Column(name = "BorrowerID")
    private Integer borrowerId; 

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