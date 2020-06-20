package com.army.web.company.controllers;

import com.army.web.company.entity.Member;
import com.army.web.company.repositorys.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    MemberRepository memberRepository;

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
    public String login(@RequestBody Member member) {
        String res = null;
        List<Member> list = memberRepository.findAll();
        for(int i = 0; i < list.size(); i++) {
            if(member.getEmail().equals(list.get(i).getEmail())) {
                if(member.getPassword().equals(list.get(i).getPassword())) {
                    res = "로그인 성공";
                    break;
                } else {
                    res = "비밀번호가 틀렸습니다.";
                    break;
                }
            } else {
                res = "일치하는 email이 없습니다.";
                break;
            }
        }
        return res;
    }
}
