package com.Nirmal.SchoolManagement.Repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Nirmal.SchoolManagement.model.RoleEntity;

public interface RoleRepo extends JpaRepository<RoleEntity, Integer> {
  
	
}
