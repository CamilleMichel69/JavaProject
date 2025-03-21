package com.example.javaproject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiningReview {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String submittedBy;
    private Long restaurantId; 
    private String review;
    
    private Integer peanutScore;
    private Integer eggScore;
    private Integer dairyScore;
    
    private ReviewStatus status;
}
