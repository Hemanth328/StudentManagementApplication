package com.sma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sma.dao.StudentEntity;
import com.sma.service.IStudentManagement;
@RestController
@RequestMapping("/studentManagement")
public class StudentController {
	
	@Autowired
	private IStudentManagement sml;
	
	@PostMapping("/register")
	public ResponseEntity<StudentEntity> registerStudent(@RequestBody StudentEntity sentity) {
		
		StudentEntity se = sml.registerStudent(sentity);
		
		return new ResponseEntity<StudentEntity>(se, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/studentdetails/{id}")
	public ResponseEntity<StudentEntity> getStudentDetails(@PathVariable Integer id) {
		
		StudentEntity se = sml.fetchStudentDetails(id);
		
		return new ResponseEntity<StudentEntity>(se, HttpStatus.OK);
	}
	
	
	@GetMapping("/studentslist")
	public ResponseEntity<List<StudentEntity>> getListOfStudents() {
		
		List<StudentEntity> list = sml.fetchListOfStudents();
		
		return new ResponseEntity<List<StudentEntity>>(list, HttpStatus.FOUND);
	}
	
	
	@PutMapping("/updatestudent")
	public ResponseEntity<StudentEntity> updateStudent(@RequestBody StudentEntity se) {
		
		StudentEntity sdetails = sml.updateStudentDetails(se);
		
		return new ResponseEntity<StudentEntity>(sdetails, HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
		
		String result = sml.deleteStudentById(id);
		
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
