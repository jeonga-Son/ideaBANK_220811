package com.example.ideaBANK.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

    @GetMapping("/")
    public String showHome() {
        return "home";
    }
}
