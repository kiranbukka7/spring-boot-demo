package com.personal.springbootdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @GetMapping(value = "/welcome")
    public static String welcome() {
        return "welcome to springboot";
    }
}
