package com.chandan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chandan.entities.User;
import com.chandan.service.UserService;

@RestController
public class HomeController {

	@Autowired
	private UserService userService;

	@ExceptionHandler(Exception.class)
	@PostMapping(path = "/createUser")
	public User createUser(@RequestBody User user) {

		return userService.createUser(user);
	}

	@GetMapping(path = "/getAllUser")
	public List<User> getAllUser() {

		return userService.getAllUser();
	}

	@ExceptionHandler(Exception.class)
	@DeleteMapping(path = "/deleteById/{id}")
	public String deleteUser(@PathVariable int id) {

		return userService.deleteUserById(id);
	}

	@ExceptionHandler(Exception.class)
	@DeleteMapping(path = "/deleteAll")
	public String deleteAllUser() {

		return userService.deleteAllUser();
	}

	@ExceptionHandler(Exception.class)
	@PutMapping(path = "/updateUser/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User user) {

		return userService.updateUser(id, user);
	}
}
