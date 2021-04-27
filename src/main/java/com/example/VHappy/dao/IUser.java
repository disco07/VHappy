package com.example.VHappy.dao;

import com.example.VHappy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUser extends JpaRepository<User, Long> {

    User findByMailAndMdp(String mail, String mdp);
}
