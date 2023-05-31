package com.example.demo.controller;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import com.example.demo.ui.UserRequestModel;
import com.example.demo.ui.UserResponseModel;
@RestController
@RequestMapping("/users")
public class UserController {
	
	private final ModelMapper modelMapper;
	private final UserService userService;
	

	public UserController(ModelMapper modelMapper, UserService userService) {
		super();
		this.modelMapper = modelMapper;
		this.userService = userService;
	}
	
	@PostMapping
	public ResponseEntity<UserResponseModel> createUser(@RequestBody UserRequestModel requestModel)
	{
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserDto userDto=modelMapper.map(requestModel, UserDto.class);
		System.out.println(userDto);
		StringBuffer sb=new StringBuffer();
		sb.append(requestModel.getPassword());
		userDto.setEncrytedPassword(sb.reverse().toString());
		System.out.println(userDto);
	 UserResponseModel responseModel=	userService.createUser(userDto);
	 
	 return ResponseEntity.status(HttpStatus.CREATED).body(responseModel);
			 
	}
	
	

}
