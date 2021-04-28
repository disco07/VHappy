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

    public User() {

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
