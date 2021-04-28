package com.example.VHappy.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Reservation {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    private Services idService;
    @ManyToOne
    private User idUser;
    @Column
    @Convert(converter = LocalDateTimeConvert.class)
    private LocalDateTime dateTime;

    public Reservation() {

    }

    public Long getId() {
        return id;
    }

    public Reservation setId(Long id) {
        this.id = id;
        return this;
    }

    public Services getIdService() {
        return idService;
    }

    public Reservation setIdService(Services idService) {
        this.idService = idService;
        return this;
    }

    public User getIdUser() {
        return idUser;
    }

    public Reservation setIdUser(User idUser) {
        this.idUser = idUser;
        return this;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Reservation setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }
}
