package com.example.demo.controllers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${first}")
    private String firstValue;

    @PreDestroy
    public void pre() {
        System.out.println("preDestroy");
    }

    @PostConstruct
    public void post() {
        System.out.println("post");
    }

    @GetMapping("/index")
    public String index() {
        return "firstValue " + firstValue;
    }
}
