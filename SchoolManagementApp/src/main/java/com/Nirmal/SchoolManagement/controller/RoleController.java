package com.Nirmal.SchoolManagement.controller;




import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Nirmal.SchoolManagement.model.RoleEntity;
import com.Nirmal.SchoolManagement.serviceImpl.RoleServiceImpl;

@RestController

public class RoleController {
	
@Autowired
	private RoleServiceImpl roleServiceImpl;
	
	public RoleController(RoleServiceImpl roleServiceImpl) {
	super();
	this.roleServiceImpl = roleServiceImpl;
}
	@PostMapping("/createrole")
	public RoleEntity CreatingRole(@RequestBody RoleEntity roleEntity) {
		return roleServiceImpl.CreateRole(roleEntity);
	}
	@GetMapping("/getrole/{roleId}")
	public RoleEntity GetRole(@PathVariable("roleId") int Id) {
		return roleServiceImpl.GetRole(Id);
		
	}
	@PutMapping("/updaterole/{roleId}")
	public RoleEntity updateRole( @PathVariable("roleId") int id , @RequestBody RoleEntity roleEntity) {
		
		return roleServiceImpl.UpdateRole(id, roleEntity);
	}
	@DeleteMapping("/deleterole/{roleId}")
	public String DeleteRole (@PathVariable("roleId") int Id) {
	return 	roleServiceImpl.DeleteRole(Id);
	}
	
	//Reading of only teachers Role
	@GetMapping("/readapiofteacherrole/{roleId}")
	public Map<Integer,String> GetAllTeachersList(@PathVariable("roleId")int roleId) {
		Map<Integer,String> re=  roleServiceImpl.GetAllTeachersList(roleId);
	return  re;
		
	}
	
	
}
