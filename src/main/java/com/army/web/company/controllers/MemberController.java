package com.army.web.company.controllers;

import com.army.web.company.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping("/{email}/{passwd}")
    public String login(@PathVariable String email,
                      @PathVariable String passwd){
            System.out.println(email+passwd);
        return email+passwd;
    }
}
