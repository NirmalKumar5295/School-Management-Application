package com.Nirmal.SchoolManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Nirmal.SchoolManagement.model.SubjectsEntity;
import com.Nirmal.SchoolManagement.serviceImpl.SubjectsServiceImpl;


@RestController
public class SubjectsController {

	@Autowired
	private SubjectsServiceImpl subjectsServiceImpl;
	
	@PostMapping("/createsubject")
	public SubjectsEntity CreatingSubject(@RequestBody SubjectsEntity subjectsEntity) {
		return subjectsServiceImpl.CreateSubject(subjectsEntity);
	}
	@GetMapping("/getsubject/{subjectId}")
	public SubjectsEntity GetSubject(@PathVariable("subjectId")int SubjectId) {
		return subjectsServiceImpl.GetSubject(SubjectId);
	}
	@PutMapping("/updatesubject/{subjectId}")
	public SubjectsEntity UpdateSubject(@PathVariable("SubjectId") int SubjectId,@RequestBody SubjectsEntity subjectsEntity) {
		return subjectsServiceImpl.updateSubject(SubjectId, subjectsEntity);
	}
	@DeleteMapping("/deleteSubject/{subjectId}")
	public String DeleteSubject(@PathVariable("SubjectId") int SubjectId) {
		return subjectsServiceImpl.DeleteSubject(SubjectId);
	}
	
}
