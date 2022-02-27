package com.Nirmal.SchoolManagement.service;

import com.Nirmal.SchoolManagement.model.UserEntity;

public interface UserService {
	public UserEntity CreateUser(UserEntity userEntity);
	public UserEntity GetUser(int Id);
	public UserEntity UpdateUser(int id,UserEntity userEntity);
	public String DeleteUser(int Id);
}
