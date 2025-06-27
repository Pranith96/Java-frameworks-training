package com.student.service;

import java.util.List;

import com.student.dto.request.StudentDeactivateRequestDto;
import com.student.dto.request.StudentRequestDto;
import com.student.dto.response.StudentResponseDto;
import com.student.entity.Student;

public interface StudentService {

	public String createStudent(StudentRequestDto studentRequest);

	public List<StudentResponseDto> getAllStudentRecords();

	public Student getStudentRecords(Integer id);

	public List<Student> getStudentDataByName(String name);

	public List<Student> getStudentDataByNameAndStatus(String name, String status);

	public String deActivateStudent(String studentCode);

	public String deActivateStudentRecords(StudentDeactivateRequestDto studentCode);

	public String updateStudent(String studentCode, StudentRequestDto studentRequestDto);

	public String deleteStudentData(Integer id);
}
