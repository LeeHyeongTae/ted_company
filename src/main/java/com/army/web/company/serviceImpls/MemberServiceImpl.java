package com.army.web.company.serviceImpls;

import com.army.web.company.domains.MemberDTO;
import com.army.web.company.mappers.MemberMapper;
import com.army.web.company.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberMapper memberMapper;

    @Override
    public List<MemberDTO> retriveAll() {
        return memberMapper.selectAll();
    }
}
