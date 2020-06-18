package com.army.web.company.services;

import com.army.web.company.entity.Message;
import com.army.web.company.repositorys.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message save(String text) {
        return repository.saveMessage(new Message(text));
    }
}
