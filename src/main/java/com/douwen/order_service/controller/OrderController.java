package com.douwen.order_service.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping()
    public String order() {
        return "I am order " + port;
    }
}
