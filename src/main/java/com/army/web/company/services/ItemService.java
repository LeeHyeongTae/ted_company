package com.army.web.company.services;

import com.army.web.company.domains.ItemDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ItemService {

   public List<ItemDTO> retriveAll();
}
