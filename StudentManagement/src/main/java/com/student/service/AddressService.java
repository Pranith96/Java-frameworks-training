package com.student.service;

import com.student.dto.request.AddressRequestDto;

public interface AddressService {

	String saveStudentAddress(AddressRequestDto addressRequest, String studentCode);

	String saveCollegeAddress(AddressRequestDto addressRequest, String collegeName);

}
