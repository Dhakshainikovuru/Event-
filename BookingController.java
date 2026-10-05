package com.hackathon.decor.controller;

import com.hackathon.decor.model.Booking;
import com.hackathon.decor.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService service;

    public BookingController(BookingService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Booking> create(@Valid @RequestBody Booking booking) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(booking));
    }

    @GetMapping
    public ResponseEntity<List<Booking>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/customer")
    public ResponseEntity<List<Booking>> getByEmail(@RequestParam String email) {
        return ResponseEntity.ok(service.getByEmail(email));
    }
}
