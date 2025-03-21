package com.example.javaproject.controller;

import org.springframework.web.bind.annotation.*;

import com.example.javaproject.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping
	  public String getAllUsers() {
	    return "Hello Users!";
	  }
}