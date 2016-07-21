package com.sunguanjun.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunguanjun.dao.UserDao;
import com.sunguanjun.pojo.User;
import com.sunguanjun.pojo.UserHobby;
import com.sunguanjun.pojo.UserHobby2;
import com.sunguanjun.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	
	public User getUserById(int userId){
		return this.userDao.selectByPrimaryKey(userId);
	}
	
	public List<UserHobby> selectUserHobby(int id){
		return userDao.selectUserHobby(id);
	}
	
	public UserHobby2 selectUserHobby2(int id){
		UserHobby2 obj = userDao.selectUserHobby3(id);
		System.out.println(obj.toString());
		return obj;
	}
}
