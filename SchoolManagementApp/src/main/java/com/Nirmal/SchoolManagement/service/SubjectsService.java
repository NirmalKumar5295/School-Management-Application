package com.Nirmal.SchoolManagement.service;

import com.Nirmal.SchoolManagement.model.SubjectsEntity;

public interface SubjectsService {

	public SubjectsEntity CreateSubject(SubjectsEntity subjectsEntity);
	public SubjectsEntity GetSubject(int SubjectId);
	public SubjectsEntity updateSubject(int SubjectId,SubjectsEntity subjectsEntity);
	public String DeleteSubject(int SubjectId);
}
