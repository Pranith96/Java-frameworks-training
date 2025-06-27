package com.student.dto.request;

import java.util.List;

public class StudentDeactivateRequestDto {

	private List<String> studentCodes;

	public List<String> getStudentCodes() {
		return studentCodes;
	}

	public void setStudentCodes(List<String> studentCodes) {
		this.studentCodes = studentCodes;
	}

}
