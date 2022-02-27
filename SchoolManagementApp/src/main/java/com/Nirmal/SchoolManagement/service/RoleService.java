package com.Nirmal.SchoolManagement.service;




import java.util.Map;
import com.Nirmal.SchoolManagement.model.RoleEntity;


public interface RoleService {
  
	public RoleEntity CreateRole(RoleEntity roleEntity);
	public RoleEntity GetRole(int Id);
	public RoleEntity UpdateRole(int id,RoleEntity roleEntity);
	public String DeleteRole(int Id);
	public Map<Integer,String> GetAllTeachersList(int roleId);
	
}
