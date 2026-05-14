package com.example.demo.entity; // 본인의 패키지 경로에 맞게 수정

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "ItemInfo")
@Getter @Setter
@NoArgsConstructor
public class ItemInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "ItemId")
    private Integer itemId;
    
    @Column(name = "UserCode", nullable = false)
    private Integer userCode;

    @Column(name = "ItemName", nullable = false, length = 50)
    private String itemName;

    @Column(name = "PostingDay", insertable = false, updatable = false)
    private LocalDateTime postingDay;

    @Column(name = "ClosingDay")
    private LocalDateTime closingDay;

    @Column(name = "presence")
    private Boolean presence = true;

    @Column(name = "price")
    private Integer price;

    @Column(name = "SecurityDeposit")
    private Integer securityDeposit = 0;

    @Column(name = "Description", length = 255)
    private String description;
}