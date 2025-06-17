package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String createStudent(Student studentRequest) {
		studentRequest.setStatus("ACTIVE");
		//studentRequest.setStudentCode("asc123");
		Student response = studentRepository.save(studentRequest);
		if (response == null) {
			return null;
		}
		return "Data saved successfully";
	}
}
