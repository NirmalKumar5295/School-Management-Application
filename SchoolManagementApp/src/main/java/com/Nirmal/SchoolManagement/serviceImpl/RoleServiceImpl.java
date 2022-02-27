package com.Nirmal.SchoolManagement.serviceImpl;



import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nirmal.SchoolManagement.Repo.RoleRepo;
import com.Nirmal.SchoolManagement.model.RoleEntity;
import com.Nirmal.SchoolManagement.model.UserEntity;
import com.Nirmal.SchoolManagement.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{
	 @Autowired
	private RoleRepo roleRepo;
	

	

	@Override
	public RoleEntity CreateRole(RoleEntity roleEntity) {
		
		return roleRepo.save(roleEntity);
	}

	@Override
	public RoleEntity GetRole(int Id) {
		
		return roleRepo.findById(Id).get();
	}

	@Override
	public RoleEntity UpdateRole(int Id ,RoleEntity roleEntity) {
		RoleEntity upDate = roleRepo.findById(Id).get();
		if(Objects.nonNull(roleEntity.getRoleName()) && !"".equalsIgnoreCase(roleEntity.getRoleName())) {
			upDate.setRoleName(roleEntity.getRoleName());
			
	}
		return roleRepo.save(upDate);
	}

	@Override
	public String DeleteRole(int Id) {
		roleRepo.deleteById(Id);
		return "Role Deleted SuccessFully "+ " "+ Id ;
	
	}

	@Override
	public Map<Integer,String> GetAllTeachersList(int roleId) {
		RoleEntity role=roleRepo.findById(roleId).get();
		
		Map<Integer,String> tn= role.getUserEntity().stream().collect(Collectors.toMap(UserEntity::getUserId, UserEntity::getUserName));
	
		return tn;
		 	}
	
	}
