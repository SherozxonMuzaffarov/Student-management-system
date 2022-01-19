package com.sms.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.model.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;
@Service
public class StudentServiceImp implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImp(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(long id) {
		studentRepository.deleteById(id);
	}
	
	
}
