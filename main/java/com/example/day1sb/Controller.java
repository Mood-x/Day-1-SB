package com.example.day1sb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/name")
    public String name(){
        return "My name is Mohammed Abdullah Alomari";
    }

    @GetMapping("/age")
    public String age(){
        return "My age is 27";
    }

    @GetMapping("/check/status")
    public String status(){
        return "Everything is OK";
    }

    @GetMapping("/health")
    public String hello(){
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public List names(){
        List names = new ArrayList();
        names.add("Mohammed");
        names.add("Ahmed");
        names.add("Ali");
        names.add("Omar");
        return names;
    }
}
