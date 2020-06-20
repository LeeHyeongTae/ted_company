package com.army.web.company.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data
public class MemberDTO {
    public String name, email, password;
}
