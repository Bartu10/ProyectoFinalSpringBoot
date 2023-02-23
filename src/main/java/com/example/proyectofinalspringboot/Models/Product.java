package com.example.proyectofinalspringboot.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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


    @OneToMany(mappedBy = "product")
    private List<ProductOrder> products;

    public Product(){}
    public Product(String name, String description, Double price, Double year, String state){
        this.name = name;
        this.description = description;
        this.price = price;
        this.year = year;
        this.state = state;
    }
}


