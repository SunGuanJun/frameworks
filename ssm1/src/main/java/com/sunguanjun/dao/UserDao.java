package com.sunguanjun.dao;

import java.util.List;

import com.sunguanjun.pojo.User;
import com.sunguanjun.pojo.UserHobby;
import com.sunguanjun.pojo.UserHobby2;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<UserHobby> selectUserHobby(int id);
    
    UserHobby2 selectUserHobby2(int id);
    
    UserHobby2 selectUserHobby3(int id);
}