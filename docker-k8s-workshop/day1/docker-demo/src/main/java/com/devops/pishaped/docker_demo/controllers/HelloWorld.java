package com.devops.pishaped.docker_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
