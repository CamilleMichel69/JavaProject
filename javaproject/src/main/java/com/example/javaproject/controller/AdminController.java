package com.example.javaproject.controller;

import org.springframework.web.bind.annotation.*;

import com.example.javaproject.repository.DiningReviewRepository;
import com.example.javaproject.repository.RestaurantRepository;
import com.example.javaproject.repository.UserRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {
	private final DiningReviewRepository diningReviewRepository;
	private final UserRepository userRepository;
    private final RestaurantRepository restaurantRepository;
    
    public AdminController(DiningReviewRepository diningReviewRepository, UserRepository userRepository, RestaurantRepository restaurantRepository) {
    	this.diningReviewRepository = diningReviewRepository;
    	this.userRepository = userRepository;
    	this.restaurantRepository = restaurantRepository;
    }
    
    @GetMapping
    public String getAdminAction() {
      return "Hello Admin!";
    }
}