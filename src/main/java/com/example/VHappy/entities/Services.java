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

    public Services(Long id, String title, Integer price, User idUser) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Services services = (Services) o;
        return idUser == services.idUser && Objects.equals(id, services.id) && Objects.equals(title, services.title) && Objects.equals(price, services.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, idUser);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Services{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", price=").append(price);
        sb.append(", idUser=").append(idUser);
        sb.append('}');
        return sb.toString();
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
