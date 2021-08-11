package com.example.customconfiguration.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
@PropertySource("classpath:custom.properties")
public class CustomController {

    @Value("${customName}")
    String name;

    @Value("${customTitle}")
    String title;


    @GetMapping("/controller")
    public String controllerTest() {
        return "Hello " + name + title;
    }
}
