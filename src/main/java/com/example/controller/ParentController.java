package com.example.controller;


import com.example.entity.Parent;
import com.example.mapper.ParentDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/parent")
public class ParentController {

    @Resource
    private ParentDao parentDao;

    @GetMapping("/list")
    public List<Parent>  list(){
        return parentDao.selectAll();
    }

}
