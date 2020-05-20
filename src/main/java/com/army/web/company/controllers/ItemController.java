package com.army.web.company.controllers;

import com.army.web.company.domains.ItemDTO;
import com.army.web.company.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("")
    public List<ItemDTO> getlist(){
        return itemService.retriveAll();
    }
}
