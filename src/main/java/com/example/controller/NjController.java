package com.example.controller;


import com.example.entity.Nj;
import com.example.mapper.NjDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/nj")
public class NjController {

    @Resource
    private NjDao njDao;

    @GetMapping("/list")
    public List<Nj> list(){
        return njDao.listAll();
    }
}
