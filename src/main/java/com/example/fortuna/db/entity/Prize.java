package com.example.fortuna.db.entity;

import javax.persistence.*;

@Entity
@Table(name="prize")
public class Prize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="photo_url")
    private String photoUrl;

    @Column(name="price")
    private String price;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Prize setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public Prize setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Prize setPrice(String price) {
        this.price = price;
        return this;
    }
}
