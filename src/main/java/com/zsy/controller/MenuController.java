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
import com.zsy.pojo.User;
import com.zsy.service.MenuService;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value="/queryUser")
	@ResponseBody
	@ApiOperation(value = "查询所有菜单",notes = "无条件查询菜单")
	public List<Menu> queryUser(){
		List<Menu> list = menuService.queryMenu();
		return list;
	}
	@RequestMapping(value="/delUserById")
	@ResponseBody
	@ApiOperation(value = "通过id删除一个菜单",notes = "通过id删除一个指定的菜单")
	public Map<String, String> delMenuById(@RequestBody String menuId){
		Map<String,String> map=new HashMap<>();
		boolean m=menuService.delMenuById(menuId);
		if(m) {
			map.put("msg", "删除成功");
		}else {
			map.put("msg", "删除失败");
		}
		return map;
	}
	@RequestMapping(value="/queryMenuById")
	@ResponseBody
	@ApiOperation(value = "通过id查找一个菜单",notes = "通过id查询一个指定的菜单")
	public List<Menu> queryMenuById(@RequestBody String menuId){
		List<Menu> list=menuService.querMenuById(menuId);
		return list;
	}
}
