package com.army.web.company.mappers;

import com.army.web.company.domains.ItemDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemMapper {
    public List<ItemDTO> selectAll();
}
