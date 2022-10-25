package com.example.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,Integer>{
	
	/*This will not be a default query so we may need to add 
	 in order to use*/
	List<User> findById(int id);
	
}