package com.chynten.sampleProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {
    @GetMapping("/sample")
    public Map<String, String> sample() {
        Map message = new HashMap<String, String>();
        message.put("message", "HelloWorld!");
        return message;
    }
}
