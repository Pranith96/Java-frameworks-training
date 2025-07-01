package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.request.AddressRequestDto;
import com.student.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddressService addressService;

	@PostMapping("/student/register/{studentCode}")
	public ResponseEntity<String> registerStudentAddress(@RequestBody AddressRequestDto addressRequest,
			@PathVariable("studentCode") String studentCode) {

		String response = addressService.saveStudentAddress(addressRequest, studentCode);
		if (response == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Data is not saved");
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@PostMapping("/college/register/{collegeName}")
	public ResponseEntity<String> registerCollegeAddress(@RequestBody AddressRequestDto addressRequest,
			@PathVariable("collegeName") String collegeName) {

		String response = addressService.saveCollegeAddress(addressRequest, collegeName);
		if (response == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Data is not saved");
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}
