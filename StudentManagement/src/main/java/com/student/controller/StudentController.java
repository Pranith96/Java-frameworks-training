package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	// http://localhost:2020/student/register
	@PostMapping("/register")
	public ResponseEntity<String> registerStudent(@RequestBody Student studentRequest) {
		String response = studentService.createStudent(studentRequest);
		if (response == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Data is not saved");
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}
