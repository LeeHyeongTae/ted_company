package com.army.web.company.controllers;

import org.springframework.stereotype.Component;


@Component
public class RandNumRepository {

    public RandNumMessage getRandom() {
        return new RandNumMessage();
    }
}
