package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemInfoEntity, Long> {
    // PK가 BIGINT(Long)이므로 Long을 적어줍니다.
}