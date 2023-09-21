package com.sma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sma.dao.StudentEntity;
import com.sma.repo.IStudentRepo;

@Service
public class StudentManagementImpl implements IStudentManagement {

	@Autowired
	private IStudentRepo stdrepo;

	@Override
	public StudentEntity registerStudent(StudentEntity se) {

		StudentEntity sentity = stdrepo.save(se);

		return sentity;
	}

	@Override
	public StudentEntity fetchStudentDetails(int sid) {

		StudentEntity sdetails = stdrepo.findById(sid).get();

		return sdetails;
	}

	@Override
	public List<StudentEntity> fetchListOfStudents() {

		List<StudentEntity> list = stdrepo.findAll();

		return list;
	}

	@Override
	public StudentEntity updateStudentDetails(StudentEntity se) {
		
		Optional<StudentEntity> sdetails = stdrepo.findById(se.getStdId());
		
		if(sdetails.isPresent()) {
			
			return stdrepo.save(se);
		}
		return null;
	}

	@Override
	public String deleteStudentById(int id) {
		
		Optional<StudentEntity> se = stdrepo.findById(id);
		
		if(se.isPresent()) {
			stdrepo.deleteById(id);
			return "Student Details with the following id " + id + " deleted successfully";
		}
		
		return "Student Details with the following id " + id + " does not exist";
		
	}

}
