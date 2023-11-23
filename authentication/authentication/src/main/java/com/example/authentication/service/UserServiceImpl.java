package com.example.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.authentication.entity.User;
import com.example.authentication.repository.UserRepository;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserRepository userRepository;

	public String addUser(User user) {
		userRepository.save(user);
		return "Added";
	}

}
