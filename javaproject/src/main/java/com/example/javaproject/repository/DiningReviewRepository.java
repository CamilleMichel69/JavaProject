package com.example.javaproject.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.example.javaproject.model.DiningReview;
import com.example.javaproject.model.ReviewStatus;

public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {
	List<DiningReview> findByStatus(ReviewStatus reviewStatus);
	List<DiningReview> findByRestaurantIdAndStatus(Long restaurantId, ReviewStatus reviewStatus);
}