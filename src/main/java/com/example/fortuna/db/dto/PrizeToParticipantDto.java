package com.example.fortuna.db.dto;

import com.example.fortuna.db.entity.Participant;
import com.example.fortuna.db.entity.Prize;

import java.util.List;

public class PrizeToParticipantDto {

    Prize prize;

    Participant participant;

    List<String> errors;

    public Prize getPrize() {
        return prize;
    }

    public PrizeToParticipantDto setPrize(Prize prize) {
        this.prize = prize;
        return this;
    }

    public Participant getParticipant() {
        return participant;
    }

    public PrizeToParticipantDto setParticipant(Participant participant) {
        this.participant = participant;
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public PrizeToParticipantDto setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }
}
