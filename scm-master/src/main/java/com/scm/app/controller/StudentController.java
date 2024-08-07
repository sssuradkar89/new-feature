package com.scm.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scm.app.model.Institute;
import com.scm.app.model.SchoolClass;
import com.scm.app.model.Student;
import com.scm.app.service.InstitueService;
import com.scm.app.service.StudentService;

@RestController
@RequestMapping(name = "/institute", value = "/institute")
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping(name = "/addstudent", value = "/addstudent")
	
	public ResponseEntity<Student> saveStudent(@RequestBody Student std) {

		try {
			Student student = service.saveStudent(std);
			return new ResponseEntity<Student>(student, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping(name = "/allstudent", value = "/allstudent")
	public List<Student> getAllStudent(){
		return service.getAllStudent();
		
	}
}
