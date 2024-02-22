package com.example.fortuna.service;

import com.example.fortuna.db.entity.Participant;
import com.example.fortuna.db.entity.Prize;
import com.example.fortuna.db.entity.PrizeToParticipant;
import com.example.fortuna.db.repository.PrizeToParticipantRepository;
import com.example.fortuna.service.crud.AbstractCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PrizeToParticipantServiceImpl
        extends AbstractCrudService<PrizeToParticipant,Long>
        implements PrizeToParticipantService
{
    private final PrizeToParticipantRepository prizeToParticipantRepository;

    @Autowired
    public PrizeToParticipantServiceImpl(
        PrizeToParticipantRepository prizeToParticipantRepository
    ) {
        super(prizeToParticipantRepository);
        this.prizeToParticipantRepository = prizeToParticipantRepository;
    }

    @Override
    public PrizeToParticipant createWinner(Participant participant, Prize prize) {

        PrizeToParticipant prizeToParticipant = new PrizeToParticipant();
        prizeToParticipant.setParticipantId(participant.getId());
        prizeToParticipant.setPrizeId(prize.getId());
        prizeToParticipant.setCreatedAt(LocalDate.now());
        prizeToParticipantRepository.save(prizeToParticipant);

        return prizeToParticipant;
    }
}
