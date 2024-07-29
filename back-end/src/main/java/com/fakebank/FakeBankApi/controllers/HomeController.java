package com.fakebank.FakeBankApi.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HomeController {
    @GetMapping
    public String home() {
        return "Hey, welcome to FakeBank! That's all folks... for now!";
    }
}
