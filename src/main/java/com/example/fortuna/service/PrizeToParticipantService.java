package com.example.fortuna.service;

import com.example.fortuna.db.entity.Participant;
import com.example.fortuna.db.entity.Prize;
import com.example.fortuna.db.entity.PrizeToParticipant;
import com.example.fortuna.service.crud.CrudService;

import java.util.Map;

public interface PrizeToParticipantService extends CrudService<PrizeToParticipant, Long> {

    PrizeToParticipant createWinner(Participant participant, Prize prize);
}
