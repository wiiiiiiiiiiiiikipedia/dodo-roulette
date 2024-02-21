package com.example.fortuna.db.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="participant")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="created_at")
    private Date createdAt;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Participant setName(String name) {
        this.name = name;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Participant setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
