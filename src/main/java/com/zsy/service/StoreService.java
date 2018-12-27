package com.zsy.service;

import java.util.List;

import com.zsy.pojo.MenuCategory;
import com.zsy.pojo.Store;

public interface StoreService {
	/**
	 * 查找所有店铺
	 * @return
	 */
	List<Store> queryStore();
	/**
	 * 通过id删除一个店铺
	 * @param menuId
	 * @return
	 */
	boolean delStoreById(String storeId);
	/**
	 * 通过id查询一个店铺
	 * @param menuId
	 * @return
	 */
	List<Store> querStoreById(String storeId);
}
