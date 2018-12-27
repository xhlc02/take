package com.zsy.pojo;
/**
 * 菜单类目
 * @author Administrator
 *
 */
public class MenuCategory {
	private int id;
	private String categoryName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "MenuCategory [id=" + id + ", categoryName=" + categoryName + "]";
	}
	
	
}
