package com.Nirmal.SchoolManagement.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Nirmal.SchoolManagement.model.UserEntity;
import com.Nirmal.SchoolManagement.serviceImpl.UserServiceImpl;


@RestController
public class UserController {
	
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	public UserController(UserServiceImpl userServiceImpl) {
		super();
		this.userServiceImpl = userServiceImpl;
	}

	@PostMapping("/createuser")
	public UserEntity CreatingUser(@RequestBody UserEntity userEntity) {
		return userServiceImpl.CreateUser(userEntity);
	}
	@GetMapping("/getuser/{userId}")
	public UserEntity GetUser(@PathVariable("userId") int Id) {
		return userServiceImpl.GetUser(Id);
		
	}
	
	@PutMapping("/updateuser/{userId}")
	public UserEntity updateUser( @PathVariable("userId") int id , @RequestBody UserEntity userEntity) {
		
		return userServiceImpl.UpdateUser(id, userEntity);
	}
	@DeleteMapping("/deleteuser/{userId}")
	public String DeleteUser (@PathVariable("userId") int Id) {
	return 	userServiceImpl.DeleteUser(Id);
	}
	
		

}
