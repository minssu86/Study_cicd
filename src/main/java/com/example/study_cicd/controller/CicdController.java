package com.example.study_cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CicdController {

    @GetMapping("/test")
    public String test(){
        return "ok!";
    }

}
