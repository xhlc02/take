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
	};
	
}
