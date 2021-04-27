package com.example.VHappy.dao;

import com.example.VHappy.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservation extends JpaRepository<Reservation, Long> {
}
