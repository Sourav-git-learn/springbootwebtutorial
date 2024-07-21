package com.learnSpring.springbootwebtutorial.springbootwebtutorial.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it contains @Container and @RequestBody which converts json to java objects
public class EmployeeController {

    @GetMapping(path = "/getSecretMessage")
    public String getMySuperSecretMessage(){
        return "Secret Message : uhedn238ueiwjiqu";
    }

}
