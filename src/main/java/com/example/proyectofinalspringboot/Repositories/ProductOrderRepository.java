package com.example.proyectofinalspringboot.Repositories;

import com.example.proyectofinalspringboot.Models.ProductOrder;
import org.springframework.data.repository.CrudRepository;

public interface ProductOrderRepository extends CrudRepository <ProductOrder, Long> {}
