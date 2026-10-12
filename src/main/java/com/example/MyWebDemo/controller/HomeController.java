package com.example.MyWebDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        return "I am Starting my SpringBoot Course";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is the about for the HomeContoller";
    }
}
