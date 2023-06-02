package com.jsp.springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springboot.dto.Student;
import com.jsp.springboot.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	private StudentRepository studentRepository;
	
	//Save
	public Student saveStudent(Student student) {
		if(student != null) {
			
			return studentRepository.save(student);
			
		}else {
			return null;
		}
	}
	
	//getAll
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	//getByID
	public Student getStudentById(int id) {
		Optional<Student> opt= studentRepository.findById(id);
		if(opt != null) {
			return opt.get();
		}return null;
	}
	
	//deleteById
	public boolean deleteStudentById(int id) {
		Optional<Student> opt= studentRepository.findById(id);
		if(opt != null) {
			studentRepository.delete(opt.get());
			return true;
		}else {
			return false;
		}
	}
	
	//update
	public Student updateStudentById(int id, Student student) {
		Optional<Student> opt= studentRepository.findById(id);
		
		if(opt != null) {
			 return studentRepository.save(student);
		}
		else {
			return null;
		}
	}
}
