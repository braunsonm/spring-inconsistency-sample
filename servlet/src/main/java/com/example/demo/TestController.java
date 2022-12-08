package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @GetMapping(path = "/")
    String test() {
        var client = restTemplateBuilder.build();
        return client.getForObject("https://google.com", String.class);
    }

}