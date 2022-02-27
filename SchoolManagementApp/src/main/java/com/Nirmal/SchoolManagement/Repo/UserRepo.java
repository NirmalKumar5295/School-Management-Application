package com.Nirmal.SchoolManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Nirmal.SchoolManagement.model.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{

}
