package com.zsy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
	/**
	 * 通过商家名和密码查询
	 * @param merchantsName
	 * @param merchantsPassword
	 * @return
	 */
	Merchants queryMerchantsnameAndPwd(@Param("merchantsName") String merchantsName,@Param("merchantsPassword") String merchantsPassword);
}
