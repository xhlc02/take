package com.zsy.pojo;
/**
 * 菜单类目
 * @author Administrator
 *
 */
public class MenuCategory {
	private int id;
	private String category_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	@Override
	public String toString() {
		return "MenuCategory [id=" + id + ", category_name=" + category_name + "]";
	}
	
}
