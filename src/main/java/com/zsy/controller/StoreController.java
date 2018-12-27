package com.zsy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zsy.pojo.Menu;
import com.zsy.pojo.Store;
import com.zsy.pojo.User;
import com.zsy.service.StoreService;
import com.zsy.service.MenuService;
import com.zsy.service.StoreService;

import io.swagger.annotations.ApiOperation;
/**
 * 店铺
 * @Controller
 * @author zhong
 *
 */
@Controller
@RequestMapping("/store")
public class StoreController {
	@Autowired
	private StoreService storeService;
	
	@RequestMapping(value="/queryStore")
	@ResponseBody
	@ApiOperation(value = "查询所有店铺",notes = "无条件查询店铺")
	public List<Store> queryStore() {
		List<Store> list = storeService.queryStore();
		return list;
	}
	@RequestMapping(value="/delStoreById")
	@ResponseBody
	@ApiOperation(value = "通过id删除一个店铺",notes = "通过id删除一个指定的店铺")
	public Map<String, String> delStoreById(@RequestBody String storeId){
		Map<String,String> map=new HashMap<>();
		List<Store> list = storeService.querStoreById(storeId);
		if(list!=null&&list.size()>0) {
			boolean m=storeService.delStoreById(storeId);
			if(m) {
				map.put("msg", "删除成功");
			}else {
				map.put("msg", "删除失败");
			}
		}else {
			map.put("msg", "你所操作的对象不存在");
		}
		
		return map;
	}
	@RequestMapping(value="/querStoreById")
	@ResponseBody
	@ApiOperation(value = "通过id查找一个店铺",notes = "通过id查询一个指定的店铺")
	public List<Store> querStoreById(@RequestBody String storeId) {
		List<Store> list=storeService.querStoreById(storeId);
		return list;
	}
}
