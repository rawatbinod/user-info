package com.binod.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binod.demo.model.User;
import com.binod.demo.service.UserService;

@RequestMapping("/users")
@RestController
@CrossOrigin(origins = "*")
//this is comment
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public void saveUser (@RequestBody User user) {
		userService.saveUser(user);
	}
	
	@PutMapping
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@GetMapping
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

}
