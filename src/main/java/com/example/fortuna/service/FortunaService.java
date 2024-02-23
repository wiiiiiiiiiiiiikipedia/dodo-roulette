package com.example.fortuna.service;

import com.example.fortuna.db.entity.PrizeToParticipant;
import com.example.fortuna.exception.AlreadyWonException;
import com.example.fortuna.exception.NoAvailablePrizesException;
import com.example.fortuna.form.ParticipantForm;

import java.util.Map;

public interface FortunaService {

    PrizeToParticipant chooseWinner(ParticipantForm participantForm)
            throws NoAvailablePrizesException, AlreadyWonException;
    PrizeToParticipant chooseWinner(String participantName)
            throws NoAvailablePrizesException, AlreadyWonException;
    Map<String, String> allWinners();
}
