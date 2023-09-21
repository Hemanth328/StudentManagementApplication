package com.sma.dao;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity
@Table(name="STUDENT_DETAILS")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stdId;
	private String name;
	private String gender;
	private String mail;
	private Long phn;
	private String address;
	private String course;
	private Float fee;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate doj;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dol;

}

