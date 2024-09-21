package com.chandan.service;

import java.util.List;

import com.chandan.entities.User;

public interface UserService {

	public User createUser(User user);

	public List<User> getAllUser();
	
	public User getById(int id);
	
	public String deleteUserById(int id);
	
	public String deleteAllUser();
	
	public User updateUser(int id, User user);
}
