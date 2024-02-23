package com.example.fortuna.db.repository;

import com.example.fortuna.db.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long>  {

    Optional<Participant> findFirstByName(String Name);
    Boolean existsByName(String name);
}
