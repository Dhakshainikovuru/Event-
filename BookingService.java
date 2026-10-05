package com.hackathon.decor.service;

import com.hackathon.decor.model.Booking;
import com.hackathon.decor.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking create(Booking booking) {
        booking.setStatus("PENDING");
        return bookingRepository.save(booking);
    }

    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }

    public List<Booking> getByEmail(String email) {
        return bookingRepository.findByEmailOrderByIdDesc(email);
    }
}
