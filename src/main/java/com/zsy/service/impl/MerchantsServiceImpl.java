package com.zsy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsy.dao.MerchantsDao;
import com.zsy.dao.MerchantsDao;
import com.zsy.pojo.Merchants;
import com.zsy.service.MerchantsService;

@Service
public class MerchantsServiceImpl implements MerchantsService {
	@Autowired
	private MerchantsDao merchantsDao;
	@Override
	public List<Merchants> queryMerchants() {
		// TODO Auto-generated method stub
		return merchantsDao.queryMerchants();
	}

	@Override
	public boolean delMerchantsById(String merchantsId) {
		boolean m=merchantsDao.delMerchantsById(merchantsId);
		return m;
	}
	
	@Override
	public List<Merchants> queryMerchantsById(String merchantsId) {
		// TODO Auto-generated method stub
		return merchantsDao.queryMerchantsById(merchantsId);
	}

	@Override
	public Merchants queryMerchantsnameAndPwd(String merchantsName, String merchantsPassword) {
		// TODO Auto-generated method stub
		return merchantsDao.queryMerchantsnameAndPwd(merchantsName,merchantsPassword);
	}

}
