package com.hackathon.decor.repository;

import com.hackathon.decor.model.Decorator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DecoratorRepository extends JpaRepository<Decorator, Long> {

    List<Decorator> findByAvailableTrue();

    List<Decorator> findByCityContainingIgnoreCaseAndAvailableTrue(String city);
}
