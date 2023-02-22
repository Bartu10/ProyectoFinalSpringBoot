package com.example.proyectofinalspringboot.Repositories;

import com.example.proyectofinalspringboot.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {}
