package com.zsy.service;

import java.util.List;

import com.zsy.pojo.User;

public interface UserService {
	/**
	 * 查找所有用户
	 * @return
	 */
	List<User> queryUser();
}
