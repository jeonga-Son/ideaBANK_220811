package com.example.ideaBANK.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class registerController {

    @GetMapping("/register")
    public String showRegister() {
        return "register";
    }
}