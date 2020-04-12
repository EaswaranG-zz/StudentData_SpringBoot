package com.easwar.studentdata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResorce {
	
	@Autowired
	StudentInterface studentInt;

	@GetMapping("students")
	public List<Student> getStudents() {

		List<Student> studentsList = (List<Student>) studentInt.findAll();
	
		return studentsList;
	}

}
