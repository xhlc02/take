package com.zsy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsy.dao.MenuCategoryDao;
import com.zsy.dao.StoreDao;
import com.zsy.pojo.MenuCategory;
import com.zsy.pojo.Store;
import com.zsy.service.MenuCategoryService;
import com.zsy.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService {
	@Autowired
	private StoreDao storeDao;

	@Override
	public List<Store> queryStore() {
		// TODO Auto-generated method stub
		return storeDao.queryStore();
	}

	@Override
	public boolean delStoreById(String storeId) {
		boolean m=storeDao.delStoreById(storeId);
		return m;
	}

	@Override
	public List<Store> querStoreById(String storeId) {
		// TODO Auto-generated method stub
		return storeDao.querStoreById(storeId);
	}
	

}
