package com.example.proyectofinalspringboot.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity @Getter @Setter
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    private Date fecha;
    private Long price;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "order")
    private List<ProductOrder> orders;

    public Order() {}

    public Order(Date fecha, Long price, User user){
        this.fecha = fecha;
        this.price = price;
        this.user = user;
    }


}
