package com.scm.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.app.model.Institute;
import com.scm.app.model.SchoolClass;
import com.scm.app.model.Student;
import com.scm.app.repo.InstituteRepo;
import com.scm.app.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo repo;

	public Student saveStudent(Student std) {
		return repo.save(std);
	}

	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}
}

