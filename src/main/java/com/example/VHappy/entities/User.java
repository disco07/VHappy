package com.example.VHappy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String mail;
    private String mdp;
    private Integer jeton;
    private String address;

    public User(Long id, String nom, String prenom, String mail, String mdp, Integer jeton, String address) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.jeton = jeton;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(nom, user.nom) && Objects.equals(prenom, user.prenom) && Objects.equals(mail, user.mail) && Objects.equals(mdp, user.mdp) && Objects.equals(jeton, user.jeton) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, mail, mdp, jeton, address);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", mdp='").append(mdp).append('\'');
        sb.append(", jeton=").append(jeton);
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public User setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public User setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public User setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getMdp() {
        return mdp;
    }

    public User setMdp(String mdp) {
        this.mdp = mdp;
        return this;
    }

    public Integer getJeton() {
        return jeton;
    }

    public User setJeton(Integer jeton) {
        this.jeton = jeton;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }
}
