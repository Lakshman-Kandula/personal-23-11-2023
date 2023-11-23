package com.example.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.authentication.dao.UserService;
import com.example.authentication.entity.User;
import com.example.authentication.service.UserServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController implements UserService {
	
	@Autowired
	private UserServiceImpl userServiceImpl;

	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		return userServiceImpl.addUser(user);
	}

}
