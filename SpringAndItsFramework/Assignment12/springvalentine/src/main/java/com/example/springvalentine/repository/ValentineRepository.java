package com.example.springvalentine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springvalentine.model.Valentine;

public interface ValentineRepository extends JpaRepository<Valentine,Long> {
    
}
