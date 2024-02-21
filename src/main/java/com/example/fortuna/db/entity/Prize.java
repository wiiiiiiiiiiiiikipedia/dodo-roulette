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

    @Column(name="count")
    private String count;

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

    public String getCount() {
        return count;
    }

    public Prize setCount(String count) {
        this.count = count;
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
