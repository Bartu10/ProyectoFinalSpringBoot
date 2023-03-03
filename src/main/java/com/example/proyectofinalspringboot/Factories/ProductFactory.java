package com.example.proyectofinalspringboot.Factories;

import com.example.proyectofinalspringboot.Models.Product;
import com.example.proyectofinalspringboot.Models.User;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductFactory {

    Faker esFaker = new Faker(new Locale("es-ES"));

    public List<Product> get(int number) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i <number; i++)
            products.add(new Product(
                    esFaker.name().firstName(),
                    esFaker.team().name(),
                    esFaker.number().numberBetween(1,100),
                    esFaker.number().numberBetween(1970,2023),
                    "buen estado"));

        return products;

    }




}
