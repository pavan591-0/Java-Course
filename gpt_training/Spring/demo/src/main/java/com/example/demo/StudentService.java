package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String welcomeNote() {
        return "You are currently gettign data from the student service";
    }
}
