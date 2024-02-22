package com.example.fortuna.db.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="prize_to_participant")
public class PrizeToParticipant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="prize_id")
    private Long prizeId;

    @Column(name="participant_id")
    private Long participantId;

    @Column(name="created_at")
    private LocalDate createdAt;

    public Long getId() {
        return id;
    }

    public Long getPrizeId() {
        return prizeId;
    }

    public PrizeToParticipant setPrizeId(Long prizeId) {
        this.prizeId = prizeId;
        return this;
    }

    public Long getParticipantId() {
        return participantId;
    }

    public PrizeToParticipant setParticipantId(Long participantId) {
        this.participantId = participantId;
        return this;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public PrizeToParticipant setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
