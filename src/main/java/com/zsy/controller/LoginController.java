package com.zsy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zsy.pojo.Merchants;
import com.zsy.pojo.User;
import com.zsy.service.MerchantsService;
import com.zsy.service.UserService;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private MerchantsService merchantsService;
	@RequestMapping(value="/userLogin")
	@ResponseBody
	@ApiOperation(value = "通过用户名和密码一个用户",notes = "通过用户名和密码一个用户")
	public Map<String,Object> userLogin(@RequestParam("username")String username, @RequestParam("password")String password,HttpServletRequest request){
		Map<String,Object> map=new HashMap<>();
		if(username!=null&&password!=null) {
			User list=userService.queryUsernameAndPwd(username,password);
			if(list!=null&&!"".equals(list)) {
				map.put("msg", list.getUsername());
				request.setAttribute("user", list);
			}else {
				map.put("msg", "用户不存在");
			}
		}else {
			map.put("msg", "用户名或密码不能为空");
		}
		
		return map;
	}
	@RequestMapping(value="/merchanrsLogin")
	@ResponseBody
	@ApiOperation(value = "通过用户名和密码一个商家",notes = "通过用户名和密码一个商家")
	public Map<String,Object> merchanrsLogin(@RequestParam("merchantsName")String merchantsName, @RequestParam("merchantsPassword")String merchantsPassword,HttpServletRequest request){
		System.out.println(merchantsName+"000"+merchantsPassword);
		Map<String,Object> map=new HashMap<>();
		if(merchantsName!=null&&merchantsPassword!=null) {
			Merchants list=merchantsService.queryMerchantsnameAndPwd(merchantsName,merchantsPassword);
			if(list!=null&&!"".equals(list)) {
				map.put("msg", list.getMerchantsName());
				request.setAttribute("merchants", list);
			}else {
				map.put("msg", "商家不存在");
			}
		}else {
			map.put("msg", "用户名或密码不能为空");
		}
		
		return map;
	}
}
