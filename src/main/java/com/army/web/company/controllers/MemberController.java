package com.army.web.company.controllers;

import com.army.web.company.entity.Member;
import com.army.web.company.proxy.Box;
import com.army.web.company.repositorys.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired MemberRepository memberRepository;
    @Autowired Box<Object> box;

    @PostMapping("/join")
    public String join(@RequestBody Member member){
        String res = "";
        try{
            memberRepository.saveAndFlush(member);
            res = "Member Save Success";
        } catch (Exception e) {
            res = "Member Save Failed : " + e;
        }
        return res;
    }

    @PostMapping("/login")
    public HashMap<String, Object> login(@RequestBody Member member) {
        box.clear();
        String res = null;
        List<Member> list = memberRepository.findAll();
        for(int i = 0; i < list.size(); i++) {
            if(member.getEmail().equals(list.get(i).getEmail())) {
                if(member.getPassword().equals(list.get(i).getPassword())) {
                    box.put("name", list.get(i).getName());
                    box.put("email", list.get(i).getEmail());
                    box.put("res","로그인 성공");
                    break;
                } else {
                    box.put("name", "No name");
                    box.put("email", "No email");
                    box.put("res","passwd not macth");
                    break;
                }
            } else {
                box.put("name", "No name");
                box.put("email", "No email");
                box.put("res","email error");
                break;
            }
        }
        return box.get();
    }
}
