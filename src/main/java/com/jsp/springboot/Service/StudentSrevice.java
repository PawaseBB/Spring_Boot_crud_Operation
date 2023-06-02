package com.jsp.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot.dao.StudentDao;
import com.jsp.springboot.dto.Student;

@Service
public class StudentSrevice {
	@Autowired
	private StudentDao studentDao;
	
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
	public List<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public Student getStudentId(int id) {
		return studentDao.getStudentById(id);
	}
	
	public boolean deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}
	
	public Student updateStudentById(int id, Student student) {
		Student old_Student=studentDao.getStudentById(id);
		if(old_Student != null) {
			old_Student.setName(student.getName());
			old_Student.setEmail(student.getEmail());
			return studentDao.updateStudentById(id, old_Student);
		}
		else {
			return null;
		}
	}
}
