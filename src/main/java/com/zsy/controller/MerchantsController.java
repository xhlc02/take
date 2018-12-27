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
import com.zsy.pojo.Merchants;
import com.zsy.pojo.User;
import com.zsy.service.MerchantsService;
import com.zsy.service.MenuService;

import io.swagger.annotations.ApiOperation;
/**
 * 商家
 * @Controller
 * @author zhong
 *
 */
@Controller
@RequestMapping("/merchants")
public class MerchantsController {
	@Autowired
	private MerchantsService merchantsService;
	
	@RequestMapping(value="/queryMerchants")
	@ResponseBody
	@ApiOperation(value = "查询所有商家",notes = "无条件查询商家")
	public List<Merchants> queryMerchants() {
		List<Merchants> list = merchantsService.queryMerchants();
		return list;
	}
	@RequestMapping(value="/delMerchantsById")
	@ResponseBody
	@ApiOperation(value = "通过id删除一个商家",notes = "通过id删除一个指定的商家")
	public Map<String, String> delMerchantsById(@RequestBody String merchantsId){
		Map<String,String> map=new HashMap<>();
		List<Merchants> list = merchantsService.queryMerchantsById(merchantsId);
		if(list!=null&&list.size()>0) {
			boolean m=merchantsService.delMerchantsById(merchantsId);
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
	@RequestMapping(value="/querMerchantsById")
	@ResponseBody
	@ApiOperation(value = "通过id查找一个商家",notes = "通过id查询一个指定的商家")
	public List<Merchants> querMerchantsById(@RequestBody String merchantsId) {
		List<Merchants> list=merchantsService.queryMerchantsById(merchantsId);
		return list;
	}
}
