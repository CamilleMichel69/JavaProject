package com.example.javaproject.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.example.javaproject.model.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
	Optional<Restaurant> findRestaurantByNameAndZipCode(String name, String zipCode);
	List<Restaurant> findRestaurantByZipCodeAndPeanutScore(String zipCode, Double peanutScore);
	List<Restaurant> findRestaurantByZipCodeAndEggScore(String zipCode, Double eggScore);
	List<Restaurant> findRestaurantByZipCodeAndDairyScore(String zipCode, Double dairyScore);
}