package com.Nirmal.SchoolManagement.serviceImpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nirmal.SchoolManagement.Repo.SubjectsRepo;
import com.Nirmal.SchoolManagement.model.SubjectsEntity;
import com.Nirmal.SchoolManagement.service.SubjectsService;

@Service
public class SubjectsServiceImpl implements SubjectsService{
	
	@Autowired
	SubjectsRepo subjectsRepo;

	@Override
	public SubjectsEntity CreateSubject(SubjectsEntity subjectsEntity) {
	
		return subjectsRepo.save(subjectsEntity);
	}

	@Override
	public SubjectsEntity GetSubject(int SubjectId) {
	
		return subjectsRepo.findById(SubjectId).get();
	}

	@Override
	public SubjectsEntity updateSubject(int SubjectId, SubjectsEntity subjectsEntity) {
	SubjectsEntity updateSubject = subjectsRepo.findById(SubjectId).get();
	if(Objects.nonNull(subjectsEntity.getSubjectName())&& !" ".equalsIgnoreCase(subjectsEntity.getSubjectName())){
		updateSubject.setSubjectName(subjectsEntity.getSubjectName());
		
	}
	return subjectsRepo.save(updateSubject);
	}

	@Override
	public String DeleteSubject(int SubjectId) {
		subjectsRepo.deleteById(SubjectId);
			return "Subject Deleted Sucessfully";
	}

}
