package com.example.testci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/get")
public class AppController {

    @GetMapping
    public String get() {
        return "Hello";
    }
}
