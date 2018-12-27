package com.zsy.dao;

import java.util.List;

import com.zsy.pojo.Menu;
import com.zsy.pojo.Store;

public interface StoreDao {
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
