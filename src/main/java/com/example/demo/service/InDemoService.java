package com.example.demo.service;

import com.example.demo.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface InDemoService {
    public String getListOfUsers() throws JsonProcessingException;
    public void saveUser(User user);

    public String getSortedListOfUsers(Integer age) throws JsonProcessingException;
}
