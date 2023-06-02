package com.jsp.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboot.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
