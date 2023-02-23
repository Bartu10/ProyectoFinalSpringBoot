package com.example.proyectofinalspringboot.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity @Getter @Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String username;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    public User(){}

    public User(String name, String username, String email, String password){
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }




}
