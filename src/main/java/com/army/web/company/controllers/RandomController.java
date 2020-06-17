package com.army.web.company.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class RandomController {
    static Random rand = new Random();
    static Logger logger = LoggerFactory.getLogger(RandomController.class);

    private RandNumService randNumService;

    @GetMapping("/random")
    @ResponseBody
    public ResponseEntity<RandNumMessage> getRandom(){
        logger.info("getRandom()");
        RandNumMessage random = new RandNumMessage();
        return ResponseEntity.ok(random);
    }
}
