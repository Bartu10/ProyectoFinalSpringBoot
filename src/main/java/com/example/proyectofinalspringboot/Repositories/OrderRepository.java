package com.example.proyectofinalspringboot.Repositories;

import com.example.proyectofinalspringboot.Models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {}
