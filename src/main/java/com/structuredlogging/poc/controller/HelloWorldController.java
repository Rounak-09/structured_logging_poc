package com.structuredlogging.poc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloWorldController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("")
    public String helloWorldHandler(){
        MDC.put("user","123");
        LOGGER.info("Hello Handler");
        MDC.clear();
        return "Hello World!";
    }

}
