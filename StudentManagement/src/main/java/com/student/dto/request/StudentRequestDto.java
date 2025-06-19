package com.student.dto.request;

import com.student.entity.Gender;

public class StudentRequestDto {

	private String name;

	private String emailId;

	private String mobileNumber;

	private Integer age;

	private Gender gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public StudentRequestDto(String name, String emailId, String mobileNumber, Integer age, Gender gender) {
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.gender = gender;
	}

	public StudentRequestDto() {
	}

}
