package com.army.web.company.controllers;

import com.army.web.company.domains.MemberDTO;
import com.army.web.company.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping("")
    public List<MemberDTO> getlist(){
        return memberService.retriveAll();
    }
}
