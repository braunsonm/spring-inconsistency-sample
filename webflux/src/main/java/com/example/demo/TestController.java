package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class TestController {
    @Autowired
    WebClient.Builder webclientBuilder;

    @GetMapping(path = "/")
    Mono<String> test() {
        var client = webclientBuilder.build();
        return client.get().uri("https://google.com").retrieve().bodyToMono(String.class);
    }

}