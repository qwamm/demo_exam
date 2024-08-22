package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    private @Id @GeneratedValue Long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "age")
    private Integer age;
    @Column(name = "country")
    private Country country;
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }
    public void setCountry(Country country)
    {
        this.country = country;
    }
    public long getId()
    {
        return this.id;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public Integer getAge()
    {
        return this.age;
    }
    public Country getCountry()
    {
        return this.country;
    }
}
