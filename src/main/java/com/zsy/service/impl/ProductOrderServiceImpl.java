package com.zsy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsy.dao.MenuCategoryDao;
import com.zsy.dao.ProductOrderDao;
import com.zsy.pojo.MenuCategory;
import com.zsy.pojo.ProductOrder;
import com.zsy.service.MenuCategoryService;
import com.zsy.service.ProductOrderService;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {
	@Autowired
	private ProductOrderDao productOrderDao;

	@Override
	public List<ProductOrder> queryProductOrder() {
		// TODO Auto-generated method stub
		return productOrderDao.queryProductOrder();
	}

	@Override
	public boolean delProductOrderById(String orderId) {
		boolean m=productOrderDao.delProductOrderById(orderId);
		return m;
	}

	@Override
	public List<ProductOrder> querProductOrderById(String orderId) {
		// TODO Auto-generated method stub
		return productOrderDao.querProductOrderById(orderId);
	}
	

}
