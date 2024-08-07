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
import com.scm.app.model.SchoolBranch;
import com.scm.app.model.SchoolClass;
import com.scm.app.service.InstitueService;
import com.scm.app.service.SchoolBranchService;

@RestController
@RequestMapping(name = "/institute", value = "/institute")
public class SchoolBranchController {

	@Autowired
	SchoolBranchService service;

	@PostMapping(name = "/addbranch", value = "/addbranch")
	
	public ResponseEntity<SchoolBranch> saveBranch(@RequestBody SchoolBranch branch) {

		try {
			SchoolBranch schoolbranch = service.saveBranch(branch);
			return new ResponseEntity<SchoolBranch>(schoolbranch, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<SchoolBranch>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping(name = "/allbranch", value = "/allbranch")
	public List<SchoolBranch> getAllSchoolBranch(){
		return service.getAllSchoolBranch();
		
	}
}