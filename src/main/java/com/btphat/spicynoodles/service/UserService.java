package com.btphat.spicynoodles.service;

import java.util.List;

import com.btphat.spicynoodles.dto.UserDto;
import com.btphat.spicynoodles.model.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public User updateUser(final UserDto userDto);
	
	public void deleteUser(final UserDto userDto);
	
	public User disableUser(final UserDto userDto);
	
	public List<UserDto> getAllUser();
	
	public User findUserByUsername(final UserDto userDto);
}
