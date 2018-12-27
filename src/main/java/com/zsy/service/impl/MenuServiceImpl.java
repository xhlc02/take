package com.zsy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsy.dao.MenuDao;
import com.zsy.dao.UserDao;
import com.zsy.pojo.Menu;
import com.zsy.pojo.User;
import com.zsy.service.MenuService;
import com.zsy.service.UserService;
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuDao menuDao;

	@Override
	public List<Menu> queryMenu() {
		// TODO Auto-generated method stub
		return menuDao.queryMenu();
	}

	@Override
	public boolean delMenuById(String menuId) {
		boolean m=menuDao.delMenuById(menuId);
		return m;
	}

	@Override
	public List<Menu> querMenuById(String menuId) {
		// TODO Auto-generated method stub
		return menuDao.querMenuById(menuId);
	}


}
