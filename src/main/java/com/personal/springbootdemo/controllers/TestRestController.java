package com.personal.springbootdemo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Test REST API Methods.
 */
@RestController
public class TestRestController {

    private static final Logger logger = LoggerFactory.getLogger(TestRestController.class);
    /**
     * Get Method to return welcome message.
     *
     * @return welcome message.
     */
    @GetMapping(value = "/welcome")
    public static String welcome() {
        logger.info("Test Info level");
        return "welcome to springboot";
    }
}
