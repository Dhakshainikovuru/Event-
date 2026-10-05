package com.hackathon.decor.controller;

import com.hackathon.decor.model.Decorator;
import com.hackathon.decor.service.DecoratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/decorators")
public class DecoratorController {

    private final DecoratorService service;

    public DecoratorController(DecoratorService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Decorator>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Decorator> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Decorator>> search(
            @RequestParam(required = false) String eventType,
            @RequestParam(required = false) String location,
            @RequestParam(required = false) Double budget,
            @RequestParam(required = false) String service) {

        return ResponseEntity.ok(
                service.search(eventType, location, budget, service)
        );
    }
}
