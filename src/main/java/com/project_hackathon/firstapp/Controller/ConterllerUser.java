package com.project_hackathon.firstapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConterllerUser {

    @GetMapping("/")
    public String disply(){
        return "Hello World";
    }
}
