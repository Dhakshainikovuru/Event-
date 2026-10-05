package com.hackathon.decor.repository;

import com.hackathon.decor.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByEmailOrderByIdDesc(String email);
}
