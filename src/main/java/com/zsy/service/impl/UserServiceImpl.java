package com.zsy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsy.dao.UserDao;
import com.zsy.pojo.User;
import com.zsy.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> queryUser() {
		// TODO Auto-generated method stub
		return userDao.queryUser();
	}

	@Override
	public boolean delUserById(String userId) {
		boolean m=userDao.delUserById(userId);
		return m;
	}

	@Override
	public List<User> queryUserById(String userId) {
		// TODO Auto-generated method stub
		return userDao.querUserById(userId);
	}

	@Override
	public User queryUsernameAndPwd(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.queryUsernameAndPwd(username, password);
	}
	
}
