package com.army.web.company.mappers;

import com.army.web.company.domains.MemberDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberMapper {
    public List<MemberDTO> selectAll();
}
