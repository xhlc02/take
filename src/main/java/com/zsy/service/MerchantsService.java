package com.zsy.service;

import java.util.List;

import com.zsy.pojo.MenuCategory;
import com.zsy.pojo.Merchants;

public interface MerchantsService {
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
	/**
	 * 通过商家名和密码查询是否存在
	 ** @param merchantsName
	 * @param merchantsPassword
	 * @return
	 */
	Merchants queryMerchantsnameAndPwd(String merchantsName, String merchantsPassword);
}
