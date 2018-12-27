package com.zsy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
