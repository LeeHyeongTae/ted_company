package com.army.web.company.controllers;

import com.army.web.company.entity.Message;
import com.army.web.company.request.MessageData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//@RequestMapping("messages")
//public class MessageController {
//    private MessageService messageService;
//
//    public MessageController(MessageService messageService) {
//        this.messageService = messageService;
//    }
//
//    @GetMapping("/welcome")
//    public String welcome(Model model) {
//        model.addAttribute("messages", "Hello, Vue-Spring-MySQL-Python-WebGL");
//        return "welcome";
//    }
//
//    @PostMapping("")
//    @RequestBody
//    public ResponseEntity<Message> saveMessage(@RequestBody MessageData data) {
//        Message saved = messageService.save(data.getText());
//
//        if(saved = null) {
//            return ResponseEntity.status(500).build();
//        }
//
//        return ResponseEntity.ok(saved);
//    }
//}
