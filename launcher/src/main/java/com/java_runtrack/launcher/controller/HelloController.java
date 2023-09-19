package com.java_runtrack.launcher.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${greeting.dev.message}")
    private String greetingMessage;

    @GetMapping("/")
    public String hello() {
        return greetingMessage;
    }
}