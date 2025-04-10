package com.btphat.spicynoodles.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.btphat.spicynoodles.dto.UserDto;
import com.btphat.spicynoodles.model.User;
import com.btphat.spicynoodles.model.UserRole;
import com.btphat.spicynoodles.repository.UserRepository;
import com.btphat.spicynoodles.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(final User user) {
		user.setEnabled(true);
		user.setRole(UserRole.CUSTOMER);
		return userRepository.save(user);
	}

	@Override
	public User update(final UserDto userDto) {
		User user = findUserByUsername(userDto);
		return userRepository.save(user);
	}

	@Override
	public void delete(final UserDto userDto) {
		User user = findUserByUsername(userDto);
		userRepository.delete(user);
	}

	@Override
	public User disable(final UserDto userDto) {
		User user = findUserByUsername(userDto);
		user.setEnabled(false);
		return userRepository.save(user);
	}

	@Override
	public List<UserDto> getAll() {
		List<User> userList = new ArrayList<User>();
		List<UserDto> userDtoList = new ArrayList<UserDto>();
		userList = userRepository.findAll();
		for(User u : userList) {
			UserDto userDto = new UserDto(u.getUsername());
			userDtoList.add(userDto);
		}
		return userDtoList;
	}

	@Override
	public User findUserByUsername(final UserDto userDto) {
		return userRepository.findUserByUsername(userDto.username())
				.orElseThrow(() -> new UsernameNotFoundException("USER NOT FOUND!!!"));
	}

}
