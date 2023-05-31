package com.example.demo.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepository;
import com.example.demo.ui.UserResponseModel;

@Service
public class UserServiceImpl implements UserService {
	private final ModelMapper modelMapper;
	private final UserRepository userRepository;

	public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
		super();
		this.modelMapper = modelMapper;
		this.userRepository = userRepository;
	}

	@Override
	public UserResponseModel createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		UserEntity userEntity=modelMapper.map(userDto, UserEntity.class);
		userEntity.setUserId(UUID.randomUUID().toString());
		System.out.println(userEntity);
		userRepository.save(userEntity);
		UserResponseModel responseModel=modelMapper.map(userEntity, UserResponseModel.class);
		return responseModel;
	}

}
