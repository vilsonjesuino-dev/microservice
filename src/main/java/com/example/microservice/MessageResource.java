package com.example.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/message")
public class MessageResource {

    @GetMapping("/simples")
    public String msgSimples() {
        return "My first app with microservice and springboot";
    }

    @GetMapping("/message-with-parameter/{name}")
    public String msgParameter(@PathVariable String name) {
        return "Welcome to app the microservice: " + name.toUpperCase();
    }
}
