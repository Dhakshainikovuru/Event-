package com.hackathon.decor.service;

import com.hackathon.decor.model.Decorator;
import com.hackathon.decor.repository.DecoratorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DecoratorService {

    private final DecoratorRepository repository;

    public DecoratorService(DecoratorRepository repository) {
        this.repository = repository;
    }

    public List<Decorator> getAll() {
        return repository.findAll();
    }

    public Decorator getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Decorator not found"));
    }

    public List<Decorator> search(String eventType, String location,
                                  Double budget, String service) {

        return repository.findAll().stream()
                .filter(Decorator::isAvailable)
                .filter(d -> isBlank(location) ||
                        d.getCity().toLowerCase().contains(location.toLowerCase()))
                .filter(d -> budget == null || d.getStartingPrice() <= budget)
                .filter(d -> isBlank(service) || service.equalsIgnoreCase("Any") ||
                        d.getServiceType().toLowerCase().contains(service.toLowerCase()))
                .filter(d -> isBlank(eventType) ||
                        d.getEventTypes().toLowerCase().contains(eventType.toLowerCase()) ||
                        d.getEventTypes().toLowerCase().contains("all"))
                .sorted((a, b) -> Double.compare(b.getRating(), a.getRating()))
                .collect(Collectors.toList());
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
