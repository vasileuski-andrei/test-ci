package com.example.testci.controller;

import com.example.testci.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/get")
public class AppController {

    private UserService userService;

    @GetMapping
    public String get() {
        userService.getUser();
        return "Hello!";
    }
}
