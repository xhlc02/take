package com.zsy.dao;

import java.util.List;

import com.zsy.pojo.Menu;
import com.zsy.pojo.Merchants;

public interface MerchantsDao {
	/**
	 * 查找所有商家
	 * @return
	 */
	List<Merchants> queryMerchants();
	/**
	 * 通过id删除一个商家
	 * @param menuId
	 * @return
	 */
	boolean delMerchantsById(String merchantsId);
	/**
	 * 通过id查询一个商家
	 * @param menuId
	 * @return
	 */
	List<Merchants> queryMerchantsById(String merchantsId);
}
