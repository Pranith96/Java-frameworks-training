package com.student.service;

import java.util.List;

import com.student.dto.request.StudentRequestDto;
import com.student.dto.response.StudentResponseDto;

public interface StudentService {

	public String createStudent(StudentRequestDto studentRequest);

	public List<StudentResponseDto> getAllStudentRecords();
}
