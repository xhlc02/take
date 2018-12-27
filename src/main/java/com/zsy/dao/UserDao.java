package com.zsy.dao;

import java.util.List;

import com.zsy.pojo.User;

public interface UserDao {
	/**
	 * 查找所有用户
	 * @return
	 */
	List<User> queryUser();
}
