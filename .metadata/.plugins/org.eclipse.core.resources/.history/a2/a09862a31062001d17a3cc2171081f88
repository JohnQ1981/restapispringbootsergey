package com.appusers.photoapp.jq.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appusers.photoapp.jq.shared.UserDto;
import com.appusers.photoapp.jq.users.data.UserEntity;
import com.appusers.photoapp.jq.users.data.UserRepository;

@Service
public class UsersServiceImpl implements UsersService  {
	
	UserRepository userRepository;
	@Autowired
	public UsersServiceImpl(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}

	@Override
	public UserDto createUser(UserDto userDetails) {
		// TODO Auto-generated method stub
		
		userDetails.setUserId(UUID.randomUUID().toString());
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity =modelMapper.map(userDetails, UserEntity.class );
		userEntity.setEncryptedPassword("test");
		
		userRepository.save(userEntity);
		UserDto returnValue =modelMapper.map(userEntity, UserDto.class);
		
		return returnValue;
	}
	
	

}
