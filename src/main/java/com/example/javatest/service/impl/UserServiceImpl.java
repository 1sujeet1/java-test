package com.example.javatest.service.impl;

import java.util.Optional;

import com.example.javatest.model.User;
import com.example.javatest.repository.UserRepository;
import com.example.javatest.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByUserById(int userId) {
		Optional<User> user = userRepository.findById(userId);
		return (user.isPresent() ? user.get() : null);
	}

}