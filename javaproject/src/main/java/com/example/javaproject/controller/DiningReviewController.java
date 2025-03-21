package com.example.javaproject.controller;

import org.springframework.web.bind.annotation.*;

import com.example.javaproject.repository.DiningReviewRepository;
import com.example.javaproject.repository.RestaurantRepository;
import com.example.javaproject.repository.UserRepository;

@RestController
@RequestMapping("/reviews")
public class DiningReviewController {
	private final DiningReviewRepository diningReviewRepository;
	private final RestaurantRepository restaurantRepository;
	private final UserRepository userRepository;
	
	public DiningReviewController(DiningReviewRepository diningReviewRepository, RestaurantRepository restaurantRepository, UserRepository userRepository) {
		this.diningReviewRepository = diningReviewRepository;
		this.restaurantRepository = restaurantRepository;
		this.userRepository = userRepository;
	}

  @GetMapping
  public String getAllReviews() {
    return "Hello Reviews!";
  }
}