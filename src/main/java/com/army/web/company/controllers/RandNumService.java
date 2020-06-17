package com.army.web.company.controllers;

import org.springframework.transaction.annotation.Transactional;


public class RandNumService {
    // 저장소
    private RandNumRepository repository;

    public RandNumService(RandNumRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public RandNumMessage getRandom() {
        return repository.getRandom();
    }
}