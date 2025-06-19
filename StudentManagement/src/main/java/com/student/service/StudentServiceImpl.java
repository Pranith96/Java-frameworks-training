package com.student.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.request.StudentRequestDto;
import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String createStudent(StudentRequestDto studentRequest) {
		Student student = new Student();
		student.setName(studentRequest.getName());
		student.setAge(studentRequest.getAge());
		student.setEmailId(studentRequest.getEmailId());
		student.setGender(studentRequest.getGender());
		student.setMobileNumber(studentRequest.getMobileNumber());
		student.setStatus("ACTIVE");
		String studentCode = generateStudentCode();
		student.setStudentCode(studentCode);
		Student response = studentRepository.save(student);
		if (response == null) {
			return null;
		}
		return "Data saved successfully";
	}

	private String generateStudentCode() {
		Random random = new Random();
		int num = random.nextInt(111,9999);
		String studentCode = "stu" + num;
		return studentCode;
	}
}
