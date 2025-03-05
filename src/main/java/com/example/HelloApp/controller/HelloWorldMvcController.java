package com.example.HelloApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldMvcController {

    @GetMapping("/hello-mvc")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello";
    }
}
