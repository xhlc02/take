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
import com.zsy.pojo.ProductOrder;
import com.zsy.pojo.User;
import com.zsy.service.ProductOrderService;
import com.zsy.service.MenuService;
import com.zsy.service.ProductOrderService;

import io.swagger.annotations.ApiOperation;
/**
 * 订单
 * @Controller
 * @author zhong
 *
 */
@Controller
@RequestMapping("/productOrder")
public class ProductOrderController {
	@Autowired
	private ProductOrderService productOrderService;
	
	@RequestMapping(value="/queryProductOrder")
	@ResponseBody
	@ApiOperation(value = "查询所有订单",notes = "无条件查询订单")
	public List<ProductOrder> queryProductOrder() {
		List<ProductOrder> list = productOrderService.queryProductOrder();
		return list;
	}
	@RequestMapping(value="/delProductOrderById")
	@ResponseBody
	@ApiOperation(value = "通过id删除一个订单",notes = "通过id删除一个指定的订单")
	public Map<String, String> delProductOrderById(@RequestBody String orderId){
		Map<String,String> map=new HashMap<>();
		List<ProductOrder> list = productOrderService.querProductOrderById(orderId);
		if(list!=null&&list.size()>0) {
			boolean m=productOrderService.delProductOrderById(orderId);
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
	@RequestMapping(value="/querProductOrderById")
	@ResponseBody
	@ApiOperation(value = "通过id查找一个订单",notes = "通过id查询一个指定的订单")
	public List<ProductOrder> querProductOrderById(@RequestBody String orderId) {
		List<ProductOrder> list=productOrderService.querProductOrderById(orderId);
		return list;
	}
}
