package com.example.javaproject.controller;

import org.springframework.web.bind.annotation.*;

import com.example.javaproject.repository.RestaurantRepository;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
	private final RestaurantRepository restaurantRepository;
	
	public RestaurantController(RestaurantRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
	}
	
	@GetMapping
	  public String getAllRestaurants() {
	    return "Hello Restaurants!";
	  }
}