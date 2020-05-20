package com.army.web.company.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data
public class MemberDTO {
    public String armyNo,name,address,brithday,inArmyDate,outDate,
            incomeDate,speciality,position,profileImage,companyId,platoonId,squadId;
}
