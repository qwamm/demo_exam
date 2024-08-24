package com.example.demo.service;

import com.example.demo.entity.Country;
import com.example.demo.entity.User;
import com.example.demo.repository.DemoRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.util.List;

@Service
public class DemoService implements InDemoService {
    @Autowired
    private DemoRepository demoRepository;
    public String getListOfUsers() throws JsonProcessingException {
        List<User> l = demoRepository.findAll();
        for (int i = 0; i < l.size(); i++) {
            System.out.printf("ID: " + l.get(i).getId() + ", First Name: " + l.get(i).getFirstName() + ", Country: " + l.get(i).getCountry() + ", Age: " + l.get(i).getAge() + ", Country: " + l.get(i).getCountry() + "%n");
        }
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(l);
        return json;
    }
    public void saveUser(User user)
    {
        demoRepository.save(user);
    }
    public String getSortedListOfUsers(Integer age) throws JsonProcessingException {
        List<User> l = demoRepository.findAdditionalInfo(age);
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(l);
        return json;
    }
}
