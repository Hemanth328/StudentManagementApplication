package com.sma.service;

import java.util.List;

import com.sma.dao.StudentEntity;

public interface IStudentManagement {
	
	public StudentEntity registerStudent(StudentEntity se);
	
	public StudentEntity fetchStudentDetails(int sid);
	
	public List<StudentEntity> fetchListOfStudents();
	
	public StudentEntity updateStudentDetails(StudentEntity se);
	
	public String deleteStudentById(int id);

}
