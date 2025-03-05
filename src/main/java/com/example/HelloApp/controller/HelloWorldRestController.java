package com.example.HelloApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldRestController {

    @GetMapping("/hello-rest")
    public String sayHello() {
        return "Hello from BridgeLabz via REST";
    }
}
