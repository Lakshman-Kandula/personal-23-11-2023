package com.example.authentication.dao;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.authentication.entity.User;

public interface UserService {
	
	public String addUser(@RequestBody User user);

}
