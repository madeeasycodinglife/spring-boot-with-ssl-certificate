package com.madeeasy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to first ssl (HTTPS) Application";
    }
}
