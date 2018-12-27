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
import com.zsy.pojo.MenuCategory;
import com.zsy.pojo.User;
import com.zsy.service.MenuCategoryService;
import com.zsy.service.MenuService;

import io.swagger.annotations.ApiOperation;
/**
 * 菜单类目
 * @Controller
 * @author zhong
 *
 */
@Controller
@RequestMapping("/menuCategory")
public class MenuCategotyController {
	@Autowired
	private MenuCategoryService menuCategoryService;
	
	@RequestMapping(value="/queryMenuCategory")
	@ResponseBody
	@ApiOperation(value = "查询所有菜单类目",notes = "无条件查询菜单类目")
	public List<MenuCategory> queryMenuCategory() {
		List<MenuCategory> list = menuCategoryService.queryMenuCategory();
		return list;
	}
	@RequestMapping(value="/delMenuCategoryById")
	@ResponseBody
	@ApiOperation(value = "通过id删除一个菜单类目",notes = "通过id删除一个指定的菜单类目")
	public Map<String, String> delMenuCategoryById(@RequestBody Integer id){
		Map<String,String> map=new HashMap<>();
		boolean m=menuCategoryService.delMenuCategoryById(id);
		if(m) {
			map.put("msg", "删除成功");
		}else {
			map.put("msg", "删除失败");
		}
		return map;
	}
	@RequestMapping(value="/querMenuCategoryById")
	@ResponseBody
	@ApiOperation(value = "通过id查找一个菜单类目",notes = "通过id查询一个指定的菜单类目")
	public List<MenuCategory> querMenuCategoryById(@RequestBody Integer id) {
		List<MenuCategory> list=menuCategoryService.querMenuCategoryById(id);
		return list;
	}
}
