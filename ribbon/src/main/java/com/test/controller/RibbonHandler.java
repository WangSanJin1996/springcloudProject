package com.test.controller;

import com.test.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author wx
 * @date 2020/10/14 11:06
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/findAll")
    public Collection<Student> findAll(){
        return  restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }

    @RequestMapping("/index")
    public String index(){
        return  restTemplate.getForObject("http://provider/student/index",String.class);
    }


 }
