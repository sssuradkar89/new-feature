package com.scm.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.app.model.Institute;
import com.scm.app.model.SchoolBranch;
import com.scm.app.repo.InstituteRepo;
import com.scm.app.repo.SchoolBranchRepo;

@Service
public class SchoolBranchService {

	@Autowired
	SchoolBranchRepo repo;

	public SchoolBranch saveBranch(SchoolBranch sb) {
		
		return repo.save(sb);
	}

	public List<SchoolBranch> getAllSchoolBranch() {
		return repo.findAll();
	}
}

