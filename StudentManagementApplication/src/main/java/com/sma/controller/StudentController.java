package com.sma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sma.service.StudentManagementImpl;

@RestController
public class StudentController {
	
	@Autowired
	private StudentManagementImpl sml;

}
