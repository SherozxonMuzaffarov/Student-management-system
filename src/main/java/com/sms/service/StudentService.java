package com.sms.service;

import java.util.List;

import com.sms.model.Student;

public interface StudentService {
	
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student updateStudent(Student student);
	
	Student getStudentById(long id);
	
	void deleteStudentById(long id);

	
}
