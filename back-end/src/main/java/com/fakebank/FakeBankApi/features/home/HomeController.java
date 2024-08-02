package com.fakebank.FakeBankApi.features.home;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService service;

    @GetMapping(produces = "application/json")
    public HomeResource getHome() {
        return service.getHome();
    }
}
