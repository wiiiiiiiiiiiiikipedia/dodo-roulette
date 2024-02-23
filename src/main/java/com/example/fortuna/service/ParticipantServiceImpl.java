package com.example.fortuna.service;

import com.example.fortuna.db.entity.Participant;
import com.example.fortuna.db.repository.ParticipantRepository;
import com.example.fortuna.service.crud.AbstractCrudService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;

@Service
public class ParticipantServiceImpl
    extends AbstractCrudService<Participant,Long>
    implements ParticipantService
{
    private final ParticipantRepository participantRepository;

    public ParticipantServiceImpl(ParticipantRepository participantRepository) {
        super(participantRepository);
        this.participantRepository = participantRepository;
    }

    @Override
    public Optional<Participant> findParticipantByName(String name) {
        return participantRepository.findFirstByName(name);
    }

    @Override
    public Boolean existsByName(String name) {
        return participantRepository.existsByName(name);
    }

    @Override
    public Participant createParticipant(String name) {

        Participant participant = new Participant();
        participant.setName(name);
        participant.setCreatedAt(LocalDate.now());
        participantRepository.save(participant);

        return participant;
    }
}
