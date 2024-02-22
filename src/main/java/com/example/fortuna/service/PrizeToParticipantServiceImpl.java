package com.example.fortuna.service;

import com.example.fortuna.db.entity.PrizeToParticipant;
import com.example.fortuna.db.repository.PrizeToParticipantRepository;
import com.example.fortuna.service.crud.AbstractCrudService;

public class PrizeToParticipantServiceImpl
        extends AbstractCrudService<PrizeToParticipant,Long>
        implements PrizeToParticipantService
{
    private final PrizeToParticipantRepository prizeToParticipantRepository;

    public PrizeToParticipantServiceImpl(PrizeToParticipantRepository prizeToParticipantRepository) {
        super(prizeToParticipantRepository);
        this.prizeToParticipantRepository = prizeToParticipantRepository;
    }
}
