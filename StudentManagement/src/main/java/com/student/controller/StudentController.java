package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.request.StudentDeactivateRequestDto;
import com.student.dto.request.StudentRequestDto;
import com.student.dto.response.StudentResponseDto;
import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	// http://localhost:2020/student/register
	@PostMapping("/register")
	public ResponseEntity<String> registerStudent(@RequestBody StudentRequestDto studentRequest) {
		String response = studentService.createStudent(studentRequest);
		if (response == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Data is not saved");
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	// http://localhost:2020/student/list
	@GetMapping("/list")
	public ResponseEntity<List<StudentResponseDto>> getAllStudents() {
		List<StudentResponseDto> response = studentService.getAllStudentRecords();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/id")
	public ResponseEntity<Student> getStudentRecords(@RequestParam("k") Integer id) {
		Student response = studentService.getStudentRecords(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Student> getStudentData(@PathVariable("id") Integer id) {
		Student response = studentService.getStudentRecords(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	// email,--> RequestParam
	// mobileNumber, studentCode --> API --> Pathvariable
	@GetMapping("/name/{name}")
	public ResponseEntity<List<Student>> getStudentDataByName(@PathVariable("name") String name) {
		List<Student> response = studentService.getStudentDataByName(name);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/name/{name} ")
	public ResponseEntity<List<Student>> getStudentDataByNameAndStatus(@PathVariable("name") String name,
			@RequestParam("status") String status) {
		List<Student> response = studentService.getStudentDataByNameAndStatus(name, status);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/deactivate/{studentCode}")
	public ResponseEntity<String> deActivateStudent(@PathVariable("studentCode") String studentCode) {
		String response = studentService.deActivateStudent(studentCode);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/deactivate/records")
	public ResponseEntity<String> deActivateStudentRecords(@RequestBody StudentDeactivateRequestDto studentCode) {
		String response = studentService.deActivateStudentRecords(studentCode);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}	

	@PutMapping("/update/{studentCode}")
	public ResponseEntity<String> updateStudent(@PathVariable("studentCode") String studentCode,
			@RequestBody StudentRequestDto studentRequestDto) {
		String response = studentService.updateStudent(studentCode, studentRequestDto);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudentData(@PathVariable("id") Integer id) {
		String response = studentService.deleteStudentData(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}