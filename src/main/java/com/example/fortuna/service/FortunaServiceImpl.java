package com.example.fortuna.service;

import com.example.fortuna.db.entity.Participant;
import com.example.fortuna.db.entity.Prize;
import com.example.fortuna.db.entity.PrizeToParticipant;
import com.example.fortuna.exception.AlreadyWonException;
import com.example.fortuna.exception.NoAvailablePrizesException;
import com.example.fortuna.form.ParticipantForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FortunaServiceImpl implements FortunaService {

    private final PrizeService prizeService;
    private final PrizeToParticipantService prizeToParticipantService;
    private final ParticipantService participantService;

    @Autowired
    public FortunaServiceImpl(
            PrizeService prizeService,
            PrizeToParticipantService prizeToParticipantService,
            ParticipantService participantService
    ) {
        this.prizeService = prizeService;
        this.prizeToParticipantService = prizeToParticipantService;
        this.participantService = participantService;
    }

    @Override
    public PrizeToParticipant chooseWinner(ParticipantForm participantForm)
            throws NoAvailablePrizesException, AlreadyWonException {

        if(prizeToParticipantService.findAll().size()==20)
            throw new NoAvailablePrizesException("Все призы закончились!");

        if(participantService.existsByName(participantForm.getName()))
            throw new AlreadyWonException("Вы уже выиграли свой приз!");

        Participant participant = participantService.createParticipant(participantForm.getName());
        Prize prize = prizeService.getRandomPrize();

        return prizeToParticipantService.createWinner(participant, prize);
    }

    @Override
    public PrizeToParticipant chooseWinner(String participantName)
        throws NoAvailablePrizesException, AlreadyWonException
    {
        ParticipantForm participantForm = new ParticipantForm();
        participantForm.setName(participantName);
        return this.chooseWinner(participantForm);
    }

    @Override
    public Map<String, String> allWinners() {

        List<PrizeToParticipant> allPrizeToParticipant = prizeToParticipantService.findAll();
        List<Participant> allParticipant = participantService.findAll();
        List<Prize> allPrize = prizeService.findAll();

        return allPrizeToParticipant.stream()
                .collect(Collectors.toMap(
                    winner -> allParticipant.stream().filter(user -> user.getId() == winner.getParticipantId()).findFirst().get().getName(),
                    winner -> allPrize.stream().filter(prize -> prize.getId() == winner.getPrizeId()).findFirst().get().getName())
                );
    }
}
