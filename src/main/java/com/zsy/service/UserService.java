package com.zsy.service;

import java.util.List;

import com.zsy.pojo.User;

public interface UserService {
	/**
	 * 查找所有用户
	 * @return
	 */
	List<User> queryUser();
	/**
	 * 通过id删除用户
	 * @param userId
	 * @return
	 */
	boolean delUserById(String userId);
	/**
	 * 通过id查询用户
	 * @param userId
	 * @return
	 */
	List<User> queryUserById(String userId);
	/**
	 * 用户登录，通过用户名和密码查找用户是否存在
	 * @param username
	 * @param password
	 * @return
	 */
	User queryUsernameAndPwd(String username, String password);
}
