package com.example.fortuna.db.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="prize_to_participant")
public class PrizeToParticipant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="prize_id")
    private String prize_id;

    @Column(name="participant_id")
    private String participant_id;

    @Column(name="created_at")
    private Date createdAt;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="prize_id", insertable = false, updatable = false)
    private Prize prize;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="participant_id", insertable = false, updatable = false)
    private Participant participant;

    public Long getId() {
        return id;
    }

    public String getPrizeId() {
        return prize_id;
    }

    public PrizeToParticipant setPrizeId(String prize_id) {
        this.prize_id = prize_id;
        return this;
    }

    public String getParticipantId() {
        return participant_id;
    }

    public PrizeToParticipant setParticipantId(String participant_id) {
        this.participant_id = participant_id;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public PrizeToParticipant setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
