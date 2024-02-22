package com.example.fortuna.service;

import com.example.fortuna.db.entity.Participant;
import com.example.fortuna.db.repository.ParticipantRepository;
import com.example.fortuna.service.crud.AbstractCrudService;

public class ParticipantServiceImpl
    extends AbstractCrudService<Participant,Long>
    implements ParticipantService
{
    private final ParticipantRepository participantRepository;

    public ParticipantServiceImpl(ParticipantRepository participantRepository) {
        super(participantRepository);
        this.participantRepository = participantRepository;
    }
}
