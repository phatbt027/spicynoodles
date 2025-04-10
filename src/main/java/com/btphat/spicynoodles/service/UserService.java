package com.btphat.spicynoodles.service;

import java.util.List;

import com.btphat.spicynoodles.dto.UserDto;
import com.btphat.spicynoodles.model.User;

public interface UserService {
	
	public User save(User user);
	
	public User update(final UserDto userDto);
	
	public void delete(final UserDto userDto);
	
	public User disable(final UserDto userDto);
	
	public List<UserDto> getAll();
	
	public User findUserByUsername(final UserDto userDto);
}
