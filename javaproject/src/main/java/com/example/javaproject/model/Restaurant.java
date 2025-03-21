package com.example.javaproject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue()
    private Long id;

    private String name;
    
    private String address;
    private String city;
    private String state;
    private String zipCode;

    private Double peanutScore;
    private Double eggScore;
    private Double dairyScore;
    private Double averageScore;
}
