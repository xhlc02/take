package com.zsy.dao;

import java.util.List;

import com.zsy.pojo.ProductOrder;
import com.zsy.pojo.User;

public interface ProductOrderDao {
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
