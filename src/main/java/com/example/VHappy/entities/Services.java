package com.example.VHappy.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Services {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private Integer price;
    @ManyToOne
    private User idUser;

    public Services() {

    }

    public Long getId() {
        return id;
    }

    public Services setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Services setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public Services setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public User getIdUser() {
        return idUser;
    }

    public Services setIdUser(User idUser) {
        this.idUser = idUser;
        return this;
    }
}
