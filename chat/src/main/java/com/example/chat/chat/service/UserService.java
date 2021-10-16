package com.example.chat.chat.service;

import java.util.List;

import com.example.chat.chat.entity.Users;

public interface UserService {
	
	public void addUser(Users user);
	public void deleteUser(Users user);
	public List<Users> getAllUser();
	public Users updateUser(Users user);
	public Users getUserById(Integer id);
}
                                                