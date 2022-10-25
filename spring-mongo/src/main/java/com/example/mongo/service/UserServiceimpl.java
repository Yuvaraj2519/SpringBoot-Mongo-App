package com.example.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongo.model.User;
import com.example.mongo.repository.UserRepository;

@Service
public class UserServiceimpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> getUsers(){
		return userRepo.findAll();
	}
	
	@Override
	public String addUser(User user) {
		userRepo.save(user);
		return "User add id is "+user.getId();
	}
	
	@Override
	public List<User> getUserById(int id) {
		/*mongo will not store exact object may don't have some field so
		 *this will have to be like this or optional user
		 */
		return userRepo.findById(id);
	}

	@Override
	public void deleteUserById(int id) {
		userRepo.deleteById(id);		
	}
}
