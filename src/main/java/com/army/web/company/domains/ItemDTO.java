package com.army.web.company.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data
public class ItemDTO {
    public String weaponNumber, weaponName, personal, common, condition, speciality;
}
