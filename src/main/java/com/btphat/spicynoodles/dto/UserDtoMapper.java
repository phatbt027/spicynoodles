package com.btphat.spicynoodles.dto;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import com.btphat.spicynoodles.model.User;

@Service
public class UserDtoMapper implements Function<User, UserDto> {

	@Override
	public UserDto apply(User user) {
		return new UserDto(
				user.getUsername()
				);
	}

}
