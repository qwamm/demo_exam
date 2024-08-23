package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.entity.Country;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.DemoService;
import com.example.demo.repository.DemoRepository;
import com.example.demo.entity.User;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {
    private final DemoService demoService = new DemoService();
    @Autowired private DemoRepository demoRepository;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("user-api/v1/users")
    public String getListOfUsers() {
        User user = new User();
        user.setId(1L);
        user.setAge(20);
        user.setFirstName("Jack");
        user.setCountry(Country.USA);
        demoRepository.save(user);
        List<User> l = demoRepository.findAll();
        for (int i = 0; i < l.size(); i++) {
            System.out.printf("ID: " + l.get(i).getId() + ", First Name: " + l.get(i).getFirstName() + ", Country: " + l.get(i).getCountry() + ", Age: " + l.get(i).getAge() + ", Country: " + l.get(i).getCountry() + "%n");
        }
        return demoService.getListOfUsers();
    }
    @PostMapping("user-api/v1/users")
    public User addUser (@RequestBody User user) {
        return demoRepository.save(user);
    }
}
