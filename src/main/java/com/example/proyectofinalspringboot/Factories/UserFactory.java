package com.example.proyectofinalspringboot.Factories;

import com.example.proyectofinalspringboot.Models.Order;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UserFactory {
    Faker esFaker = new Faker(new Locale("es-ES"));

    public List<Order> get(int number) {
        public List<Order> orders = new ArrayList<>();
        for (int i = 0; i <number; i++)
            orders.add(new)
    }
    }
