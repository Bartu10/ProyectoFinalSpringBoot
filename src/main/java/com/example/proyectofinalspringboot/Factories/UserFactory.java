package com.example.proyectofinalspringboot.Factories;

import com.example.proyectofinalspringboot.Models.User;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UserFactory {
    Faker esFaker = new Faker(new Locale("es-ES"));

    public List<User> get(int number) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i <number; i++)
            users.add(new User(esFaker.name().firstName(),
                    esFaker.name().username(),
                    esFaker.internet().emailAddress(),
                    esFaker.internet().password()));

        return users;

    }
    }
