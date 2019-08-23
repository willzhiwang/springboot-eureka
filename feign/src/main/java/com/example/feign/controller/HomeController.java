package com.example.feign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(){
        return "views/index";
    }

    @RequestMapping(value = "/welcome")
    public String home(){
        return "views/welcome";
    }
    @RequestMapping(value = "/welcome/welcome")
    public String homehome(){
        return "views/welcome";
    }
}
