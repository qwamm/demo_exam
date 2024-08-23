package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.service.InDemoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.DemoService;
import com.example.demo.entity.User;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private InDemoService demoService;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("user-api/v1/users")
    public String getListOfUsers() throws JsonProcessingException {
        return demoService.getListOfUsers();
    }
    @GetMapping("user-api/v1/additional-info")
    public String getInfo(@RequestParam("age") String age)
    {
        return age;
    }
    @PostMapping("user-api/v1/users")
    public void addUser (@RequestBody User user) {
        demoService.saveUser(user);
    }
}
