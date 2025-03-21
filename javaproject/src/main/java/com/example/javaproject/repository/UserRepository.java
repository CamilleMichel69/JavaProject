package com.example.javaproject.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.example.javaproject.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findUserByName(String name);
}