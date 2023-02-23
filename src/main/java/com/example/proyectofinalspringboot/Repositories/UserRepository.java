package com.example.proyectofinalspringboot.Repositories;

import com.example.proyectofinalspringboot.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
