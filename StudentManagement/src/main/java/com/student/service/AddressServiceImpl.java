package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.request.AddressRequestDto;
import com.student.entity.Address;
import com.student.entity.Student;
import com.student.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepository;

	@Autowired
	StudentService studentService;

	@Override
	public String saveStudentAddress(AddressRequestDto addressRequest, String studentCode) {
		// verify student exists
		try {
			Student student = studentService.getStudentByCode(studentCode);
		} catch (Exception ex) {
			throw new RuntimeException("Address Not saved", ex);
		}
		Address address = convertAddressDtoToEntity(addressRequest);
		address.setStudentCode(studentCode);
		Address response = addressRepository.save(address);
		if (response == null) {
			return null;
		}
		return "Data saved successfully";
	}

	private Address convertAddressDtoToEntity(AddressRequestDto addressRequest) {
		Address address = new Address();
		address.setCity(addressRequest.getCity());
		address.setCountry(addressRequest.getCountry());
		address.setLocality(addressRequest.getLocality());
		address.setPincode(addressRequest.getPincode());
		address.setPlotNo(addressRequest.getPlotNo());
		address.setRoadNo(addressRequest.getRoadNo());
		address.setState(addressRequest.getState());
		return address;
	}

	@Override
	public String saveCollegeAddress(AddressRequestDto addressRequest, String collegeName) {
		Address address = convertAddressDtoToEntity(addressRequest);
		address.setCollegeName(collegeName);
		Address response = addressRepository.save(address);
		if (response == null) {
			return null;
		}
		return "Data saved successfully";
	}
}
