package com.sunguanjun.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunguanjun.dao.UserDao;
import com.sunguanjun.pojo.User;
import com.sunguanjun.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	
	public User getUserById(int userId){
		return this.userDao.selectByPrimaryKey(userId);
	}
}
