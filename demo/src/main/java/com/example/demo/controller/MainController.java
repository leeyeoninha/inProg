package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    
    // Test : 브라우저에 http://localhost:8080/hello?name=crlee         
    @GetMapping("/hello")
    public String sayHellow(@RequestParam("name") String name){
        return "Hello "+name;
    }
}
