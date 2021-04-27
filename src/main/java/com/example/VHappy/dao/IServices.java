package com.example.VHappy.dao;

import com.example.VHappy.entities.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IServices extends JpaRepository<Services, Long> {
}
