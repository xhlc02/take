package com.zsy.service;

import java.util.List;

import com.zsy.pojo.ProductOrder;

public interface ProductOrderService {
	/** 
	* 查找所有订单
	 * @return
	 */
	List<ProductOrder> queryProductOrder();
	/**
	 * 通过id删除一个订单
	 * @param orderId
	 * @return
	 */
	boolean delProductOrderById(String orderId);
	/**
	 * 通过id查询一个订单
	 * @param orderId
	 * @return
	 */
	List<ProductOrder> querProductOrderById(String orderId);
}
