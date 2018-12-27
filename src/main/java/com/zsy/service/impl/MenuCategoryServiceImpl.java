package com.zsy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsy.dao.MenuCategoryDao;
import com.zsy.pojo.MenuCategory;
import com.zsy.service.MenuCategoryService;

@Service
public class MenuCategoryServiceImpl implements MenuCategoryService {
	@Autowired
	private MenuCategoryDao menuCategoryDao;
	@Override
	public List<MenuCategory> queryMenuCategory() {
		// TODO Auto-generated method stub
		return menuCategoryDao.queryMenuCategory();
	}

	@Override
	public boolean delMenuCategoryById(Integer id) {
		boolean m=menuCategoryDao.delMenuCategoryById(id);
		return m;
	}

	@Override
	public List<MenuCategory> querMenuCategoryById(Integer id) {
		// TODO Auto-generated method stub
		return menuCategoryDao.querMenuCategoryById(id);
	}

}
