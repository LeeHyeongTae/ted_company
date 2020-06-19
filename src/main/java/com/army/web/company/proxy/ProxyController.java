package com.army.web.company.proxy;

import com.army.web.company.entity.Bicycle;
import com.army.web.company.repositorys.BicycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/proxy")
public class ProxyController {
    @Autowired Proxy pxy;
    @Autowired Box<Object> box;
    @Autowired BicycleRepository bicycleRepository;
    @Autowired Crawler crawler;

    @GetMapping("/bicycle")
    public HashMap<String, Object> bicycle() {
        box.clear();
        if(bicycleRepository.count() == 0) crawler.bikes();
        List<Bicycle> list = bicycleRepository.findAll();
        box.put("list", list);
        box.put("count", list.size());
        return box.get();
    }
}
