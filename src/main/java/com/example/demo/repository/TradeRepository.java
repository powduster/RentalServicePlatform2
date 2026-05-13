package com.example.demo.repository; // 본인의 패키지 경로 확인 (보통 소문자 권장)

import com.example.demo.entity.TradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends JpaRepository<TradeEntity, Long> {

}