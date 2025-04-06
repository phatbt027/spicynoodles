package com.btphat.spicynoodles.dto;

import java.util.function.Function;

import com.btphat.spicynoodles.model.User;

public class UserDtoMapper implements Function<User, UserDto> {

	@Override
	public UserDto apply(User user) {
		return new UserDto(
				user.getUsername()
				);
	}

}
