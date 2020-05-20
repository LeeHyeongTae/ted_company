package com.army.web.company.services;

import com.army.web.company.domains.MemberDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MemberService {

   public List<MemberDTO> retriveAll();
}
