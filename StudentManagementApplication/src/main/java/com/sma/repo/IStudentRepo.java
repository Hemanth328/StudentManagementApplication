package com.sma.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sma.dao.StudentEntity;

public interface IStudentRepo extends JpaRepository<StudentEntity, Integer> {

}
