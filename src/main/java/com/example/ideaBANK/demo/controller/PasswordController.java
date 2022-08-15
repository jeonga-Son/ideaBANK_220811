package com.example.ideaBANK.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasswordController {

    @GetMapping("/password")
    public String showPasswordRecovery() {
        return "password.html";
    }
}
