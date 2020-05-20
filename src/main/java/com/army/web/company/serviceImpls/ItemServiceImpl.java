package com.army.web.company.serviceImpls;

import com.army.web.company.domains.ItemDTO;
import com.army.web.company.mappers.ItemMapper;
import com.army.web.company.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemMapper itemMapper;
    @Override
    public List<ItemDTO> retriveAll() {
        return itemMapper.selectAll();
    }
}
