package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String sayHi(){
        return "Hello from strict word";
    }

    @GetMapping("/welcome")
    public String welcomeNote(){
        return studentService.welcomeNote();
    }
}
