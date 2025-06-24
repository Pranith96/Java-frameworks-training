package com.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.request.StudentRequestDto;
import com.student.dto.response.StudentResponseDto;
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
		int num = random.nextInt(111, 9999);
		String studentCode = "stu" + num;
		return studentCode;
	}

	@Override
	public List<StudentResponseDto> getAllStudentRecords() {
		List<Student> studentList = studentRepository.findAll();
		if (studentList == null) {
			throw new RuntimeException("Data is empty");
		}
		List<StudentResponseDto> students = new ArrayList<>();

		for (Student student : studentList) {
			StudentResponseDto response = new StudentResponseDto();
			response.setAge(student.getAge());
			response.setEmailId(student.getEmailId());
			response.setGender(student.getGender());
			response.setId(student.getId());
			response.setMobileNumber(student.getMobileNumber());
			response.setName(student.getName());
			response.setStatus(student.getStatus());
			response.setStudentCode(student.getStudentCode());

			students.add(response);
		}
		return students;
	}

	@Override
	public Student getStudentRecords(Integer id) {
		Optional<Student> response = studentRepository.findById(id);
		if(!response.isPresent()) {
			throw new RuntimeException("Data is empty");
		}
		return response.get();
	}

	@Override
	public List<Student> getStudentDataByName(String name) {
		Optional<List<Student>> response = studentRepository.findByName(name); // emailId, mobileNumber, Status
		if(!response.isPresent()) {
			throw new RuntimeException("Data is empty");
		}
		return response.get();	}
}
