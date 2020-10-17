package com.binod.demo.service;

import java.util.List;

import com.binod.demo.model.User;

public interface UserService {
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(int id);
	
	User getUserById(int id);
	
	List<User> getAllUser();

}
