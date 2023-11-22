package com.excellence.springboot_restful_webservices.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.excellence.springboot_restful_webservices.dto.UserDto;
import com.excellence.springboot_restful_webservices.entity.User;

@Mapper
public interface AutoUserMapper {

	AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

	UserDto mapToUserDto(User user);

	User mapToUser(UserDto userDto);
}
