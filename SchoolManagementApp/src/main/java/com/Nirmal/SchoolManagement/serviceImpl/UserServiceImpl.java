package com.Nirmal.SchoolManagement.serviceImpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nirmal.SchoolManagement.Repo.UserRepo;
import com.Nirmal.SchoolManagement.model.UserEntity;
import com.Nirmal.SchoolManagement.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo userRepo;
	
	
//adds the user
	@Override
	public UserEntity CreateUser(UserEntity userEntity) {
		
		return userRepo.save(userEntity);
	}

	@Override
	public UserEntity GetUser(int Id) {
		
		return userRepo.findById(Id).get();
	}

	@Override
	public UserEntity UpdateUser(int id, UserEntity userEntity) {
	UserEntity	userup = userRepo.findById(id).get();
		if(Objects.nonNull(userEntity.getUserName()) && !"".equalsIgnoreCase(userEntity.getUserName())) {
			userup.setUserName(userEntity.getUserName());
		}
		if(Objects.nonNull(userEntity.getQualification()) && !"".equalsIgnoreCase(userEntity.getQualification())) {
			userup.setQualification(userEntity.getQualification());
		}
		return userRepo.save(userup);
	}

	@Override
	public String DeleteUser(int Id) {
		userRepo.deleteById(Id);
		return "User"+ Id  +"Deleted successfully";
	}

	

}
