package com.example.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.model.User;
import com.example.mongo.service.UserService;


@RestController
@RequestMapping("/userDetails")
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		return userservice.addUser(user);
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return userservice.getUsers();
	}
	
	@GetMapping("/getUserById/{id}")
	public List<User> getUserById(@PathVariable int id){
		return userservice.getUserById(id);
	}
	
	@DeleteMapping("/deleteUserById/{id}")
	public void deleteUserById(@PathVariable int id) {
		userservice.deleteUserById(id);
	}
}
