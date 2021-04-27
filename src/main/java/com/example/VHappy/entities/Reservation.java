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

    public Reservation(Long id, Services idService, User idUser, LocalDateTime dateTime) {
        this.id = id;
        this.idService = idService;
        this.idUser = idUser;
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id) && Objects.equals(idService, that.idService) && Objects.equals(idUser, that.idUser) && Objects.equals(dateTime, that.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idService, idUser, dateTime);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reservation{");
        sb.append("id=").append(id);
        sb.append(", idService=").append(idService);
        sb.append(", idUser=").append(idUser);
        sb.append(", dateTime=").append(dateTime);
        sb.append('}');
        return sb.toString();
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
