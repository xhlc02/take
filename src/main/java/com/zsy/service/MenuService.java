package com.zsy.service;

import java.util.List;

import com.zsy.pojo.Menu;

public interface MenuService {
	/**
	 * 查找所有菜单
	 * @return
	 */
	List<Menu> queryMenu();
	/**
	 * 通过id删除一个菜单
	 * @param userId
	 * @return
	 */
	boolean delMenuById(String menuId);
	/**
	 * 通过id查询一个菜单
	 * @param userId
	 * @return
	 */
	List<Menu> querMenuById(String menuId);
}
