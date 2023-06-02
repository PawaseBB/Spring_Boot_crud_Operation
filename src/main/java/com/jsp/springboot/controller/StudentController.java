package com.jsp.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot.Service.StudentSrevice;
import com.jsp.springboot.dto.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentSrevice studentSrevice;
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		return studentSrevice.saveStudent(student);
	}
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentSrevice.getAllStudents();
	}
	@GetMapping("/students/{id}")
	public Student getStudentId(@PathVariable int id) {
		return studentSrevice.getStudentId(id);
	}
	@DeleteMapping("/students/{id}")
	public boolean deleteStudentById(@PathVariable int id) {
		return studentSrevice.deleteStudentById(id);
	}
	@PutMapping("/students/{id}")
	public Student updateStudentById(@PathVariable int id, @RequestBody Student student) {
		return studentSrevice.updateStudentById(id, student);
	}
}
