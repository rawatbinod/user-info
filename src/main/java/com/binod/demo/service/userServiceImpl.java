package com.binod.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.binod.demo.model.User;
import com.binod.demo.repository.UserRepository;

@Service
public class userServiceImpl implements UserService {
	
	@Autowired
	private UserRepository  userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
		
	}
	
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUser() {	
		return userRepository.findAll();
	}

}
