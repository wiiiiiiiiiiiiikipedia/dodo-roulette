package com.example.fortuna.db.repository;

import com.example.fortuna.db.entity.Prize;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrizeRepository extends JpaRepository<Prize, Long> {
}
