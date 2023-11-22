package com.excellence.springboot_restful_webservices.service;

import java.util.List;

import com.excellence.springboot_restful_webservices.dto.UserDto;

public interface UserService {
	UserDto createUser(UserDto user);

	UserDto getUserById(Long userId);

	List<UserDto> getAllUsers();

	UserDto updateUser(UserDto user);

	void deleteUser(Long userId);
}
