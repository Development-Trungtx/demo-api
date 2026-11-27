package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    @RequestMapping("/test")
    public String test() {
        return "Titus test v2";
    }

    @GetMapping
    @RequestMapping("/test-api")
    public String test1() {
        return "Titus test api 2000";
    }
}
