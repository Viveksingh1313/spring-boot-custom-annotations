package com.example.customconfiguration.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/root")
public class TestController {
    @Value("${name}")
    String name;

    @Value("${title}")
    String title;

    @GetMapping("/controller")
    public String controllerTest() {
        return "Hello " + name + title;
    }
}
