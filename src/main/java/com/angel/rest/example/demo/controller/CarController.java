package com.angel.rest.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/car")
    public String getCar(){
        System.out.println("Renault");
        return "Renault Clio";
    }
}
