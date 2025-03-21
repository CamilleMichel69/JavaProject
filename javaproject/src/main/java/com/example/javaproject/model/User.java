package com.example.javaproject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String city;
	private String state;
	private String zipCode;
	
	private Boolean isPeanutAllergy;
	private Boolean isEggAllergy;
	private Boolean isDairyAllergy;
}