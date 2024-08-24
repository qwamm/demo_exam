package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.service.InDemoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.HTTP;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.DemoService;
import com.example.demo.entity.User;
import com.google.gson.Gson;
import javax.xml.crypto.Data;
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
    @ResponseStatus(HttpStatus.OK)
    public String getListOfUsers() throws JsonProcessingException {
        return demoService.getListOfUsers();
    }
    @GetMapping("user-api/v1/additional-info")
    @ResponseStatus(HttpStatus.OK)
    public String getInfo(@RequestParam("age") String age) throws JsonProcessingException {
        return demoService.getSortedListOfUsers(Integer.valueOf(age));
    }
    @PostMapping("user-api/v1/users")
    @ResponseStatus(HttpStatus.OK)
    public void addUser (@RequestBody String user) {
        String str = user.toString();
        System.out.println(str);
        User data = new Gson().fromJson(str, User.class);
        System.out.printf("ID: " + data.getId() + ", First Name: " + data.getFirstName() + ", Country: " + data.getCountry() + ", Age: " + data.getAge() + ", Country: " + data.getCountry() + "%n");
        demoService.saveUser(data);
    }
}
