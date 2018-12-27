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

import com.zsy.pojo.User;
import com.zsy.service.UserService;
import com.zsy.service.impl.UserServiceImpl;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/queryUser")
	@ResponseBody
	@ApiOperation(value = "查询所有用户",notes = "无条件查询用户")
	public List<User> queryUser(){
		List<User> list = userService.queryUser();
		return list;
	}
	@RequestMapping(value="/delUserById")
	@ResponseBody
	@ApiOperation(value = "通过id删除一个用户",notes = "通过id删除一个指定的用户")
	public Map<String, String> delUserById(@RequestBody String userId){
		Map<String,String> map=new HashMap<>();
		boolean m=userService.delUserById(userId);
		if(m) {
			map.put("msg", "删除成功");
		}else {
			map.put("msg", "删除失败");
		}
		return map;
	}
	@RequestMapping(value="/queryUserById")
	@ResponseBody
	@ApiOperation(value = "通过id查找一个用户",notes = "通过id查询一个指定的用户")
	public List<User> queryUserById(@RequestBody String userId){
		List<User> list=userService.queryUserByIdr(userId);
		return list;
	}
}
