package com.example.demo.repository;

import com.example.demo.entity.ItemInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemInfoEntity, Long> {
}