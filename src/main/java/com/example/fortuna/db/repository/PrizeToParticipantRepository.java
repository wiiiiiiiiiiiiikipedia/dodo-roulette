package com.example.fortuna.db.repository;

import com.example.fortuna.db.entity.PrizeToParticipant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PrizeToParticipantRepository extends JpaRepository<PrizeToParticipant, Long> {

}
