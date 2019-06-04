package com.spring.starter.service;

import com.spring.starter.Repository.StarterRepository;
import com.spring.starter.entity.Starter;
import org.springframework.stereotype.Service;

@Service
public class StarterService {

    private StarterRepository repository;

    public StarterService(StarterRepository repository) {
        this.repository = repository;
    }

    public Starter saveRecord(Starter entity) {
        return repository.save(entity);
    }
}
