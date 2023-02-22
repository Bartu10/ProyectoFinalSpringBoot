package com.example.proyectofinalspringboot.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter

public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private String description;

    private Double price;

    private Double year;

    private String state;

}
