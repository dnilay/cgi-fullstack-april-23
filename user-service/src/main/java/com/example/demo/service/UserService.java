package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.ui.UserResponseModel;

public interface UserService {

	public UserResponseModel createUser(UserDto userDto);

	public List<UserEntity> getAllUsers();
	
	public UserResponseModel getuserById(int id);
	
	public void deleteUserById(int id);
	
	public UserResponseModel updateUserById(int id);
	
	public void deleteAllUsers();

}
