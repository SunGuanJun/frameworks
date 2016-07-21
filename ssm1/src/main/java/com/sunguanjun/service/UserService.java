package com.sunguanjun.service;

import java.util.List;

import com.sunguanjun.pojo.User;
import com.sunguanjun.pojo.UserHobby;
import com.sunguanjun.pojo.UserHobby2;

public interface UserService {
	public User getUserById(int userId);
	
	public List<UserHobby> selectUserHobby(int id);
	
	public UserHobby2 selectUserHobby2(int id);
}
