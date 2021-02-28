package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Homework {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long homeworkId;
	
	@NotBlank
	private String category;
	
	@NotBlank
	private String title;
	
	@NotBlank
	private String content;
	
//	@Temporal(TemporalType.TIMESTAMP)
//	private String dueDate;
	
}
