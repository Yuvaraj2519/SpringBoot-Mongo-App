package com.example.mongo.service;

import java.util.List;

import com.example.mongo.model.User;

public interface UserService{

	String addUser(User user);
	List<User> getUsers();
	List<User> getUserById(int id);
	void deleteUserById(int id);
}
