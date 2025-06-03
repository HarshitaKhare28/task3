package com.example.task3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task3.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    
}
