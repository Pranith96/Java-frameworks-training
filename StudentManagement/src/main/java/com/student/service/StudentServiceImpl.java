package com.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dto.request.StudentDeactivateRequestDto;
import com.student.dto.request.StudentRequestDto;
import com.student.dto.response.StudentResponseDto;
import com.student.entity.Student;
import com.student.exception.BusinessException;
import com.student.exception.StudentNotFoundException;
import com.student.repository.StudentRepository;

@Transactional
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
			//throw new BusinessException(String.format("Exception occurred while saving {}", studentRequest));
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
			throw new BusinessException(String.format("Data is empty"));
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
		if (!response.isPresent()) {
			throw new StudentNotFoundException(String.format("No Records Found for id: %s ", id));
		}
		return response.get();
	}

	@Override
	public List<Student> getStudentDataByName(String name) {
		Optional<List<Student>> response = studentRepository.findByName(name); // emailId, mobileNumber, Status
		if (!response.isPresent()) {
			throw new StudentNotFoundException(String.format("No Records Found for name: %s", name));
		}
		return response.get();
	}

	@Override
	public List<Student> getStudentDataByNameAndStatus(String name, String status) {
		Optional<List<Student>> response = studentRepository.findByNameAndStatus(name, status); // findByNameOrStatus,
																								// findByNameAndStatusOrderByNameDesc
		if (!response.isPresent()) {
			throw new StudentNotFoundException(
					String.format("No Records Found for name: %s and status: %s ", name, status));
		}
		return response.get();
	}

	@Transactional
	@Override
	public String deActivateStudent(String studentCode) {
		String status = "INACTIVE";
		studentRepository.updateStudentByStatus(status, studentCode);
		return "Student Deactivated";
	}

	@Transactional
	@Override
	public String deActivateStudentRecords(StudentDeactivateRequestDto studentCode) {
		String status = "INACTIVE";
		List<String> studentCodes = studentCode.getStudentCodes();
		studentRepository.updateStudentByStatusAndCodes(status, studentCodes);
		return "Student Deactivated";
	}

	@Override
	public Student getStudentByCode(String studentCode) {
		Optional<Student> response = studentRepository.findByStudentCode(studentCode);
		if (!response.isPresent()) {
			throw new StudentNotFoundException(String.format("No Records Found for student code: %s", studentCode));
		}
		return response.get();
	}

	@Transactional
	@Override
	public String updateStudent(String studentCode, StudentRequestDto studentRequestDto) {
		Student currentStudent = getStudentByCode(studentCode);

		if (studentRequestDto.getAge() != null && studentRequestDto.getAge() > 0) {
			currentStudent.setAge(studentRequestDto.getAge());
		}
		if (studentRequestDto.getEmailId() != null) {
			currentStudent.setEmailId(studentRequestDto.getEmailId());
		}

		if (studentRequestDto.getGender() != null) {
			currentStudent.setGender(studentRequestDto.getGender());
		}
		if (studentRequestDto.getMobileNumber() != null) {
			currentStudent.setMobileNumber(studentRequestDto.getMobileNumber());
		}
		if (studentRequestDto.getName() != null) {
			currentStudent.setName(studentRequestDto.getName());
		}

		Student response = studentRepository.save(currentStudent);
		if (response == null) {
			return null;
		}
		return "Data updated successfully";
	}

	@Transactional
	@Override
	public String deleteStudentData(Integer id) {
		Student response = getStudentRecords(id);
		// studentRepository.deleteById(id); // deleteByName(name),//
		// deleteByStudentCode(code)
		studentRepository.delete(response);
		return "Deleted successfully";
	}
}
