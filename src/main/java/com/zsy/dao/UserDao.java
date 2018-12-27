package com.zsy.dao;

import java.util.List;

import com.zsy.pojo.User;

public interface UserDao {
	/**
	 * 查找所有用户
	 * @return
	 */
	List<User> queryUser();
	/**
	 * 通过id删除一个用户
	 * @param userId
	 * @return
	 */
	boolean delUserById(String userId);
	/**
	 * 通过id查询一个用户
	 * @param userId
	 * @return
	 */
	List<User> querUserById(String userId);
}
