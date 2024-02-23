package com.example.fortuna.service;

import com.example.fortuna.db.entity.Participant;
import com.example.fortuna.service.crud.CrudService;

import java.util.Map;
import java.util.Optional;

public interface ParticipantService
    extends CrudService<Participant, Long> {

    Optional<Participant> findParticipantByName(String name);
    Boolean existsByName(String name);
    Participant createParticipant(String name);
}
