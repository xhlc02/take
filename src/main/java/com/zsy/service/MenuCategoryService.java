package com.zsy.service;

import java.util.List;

import com.zsy.pojo.MenuCategory;

public interface MenuCategoryService {
	/**
	 * 查找所有菜单分类
	 * @return
	 */
	List<MenuCategory> queryMenuCategory();
	/**
	 * 通过id删除一个菜单分类
	 * @param menuId
	 * @return
	 */
	boolean delMenuCategoryById(Integer id);
	/**
	 * 通过id查询一个菜单分类
	 * @param menuId
	 * @return
	 */
	List<MenuCategory> querMenuCategoryById(Integer id);
}
