package com.zsy.pojo;
/**
 * 菜单
 * @author Administrator
 *
 */
public class Menu {
	private String menuId;
	private String storeId;
	private String menuName;
	private Double menuPrice;
	private String menuDescribe;
	private String menuImg;
	private String menuCreateTime;
	private String menuUpdateTime;
	private int menuStauts;
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Double getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(Double menuPrice) {
		this.menuPrice = menuPrice;
	}
	public String getMenuDescribe() {
		return menuDescribe;
	}
	public void setMenuDescribe(String menuDescribe) {
		this.menuDescribe = menuDescribe;
	}
	public String getMenuImg() {
		return menuImg;
	}
	public void setMenuImg(String menuImg) {
		this.menuImg = menuImg;
	}
	public String getMenuCreateTime() {
		return menuCreateTime;
	}
	public void setMenuCreateTime(String menuCreateTime) {
		this.menuCreateTime = menuCreateTime;
	}
	public String getMenuUpdateTime() {
		return menuUpdateTime;
	}
	public void setMenuUpdateTime(String menuUpdateTime) {
		this.menuUpdateTime = menuUpdateTime;
	}
	public int getMenuStauts() {
		return menuStauts;
	}
	public void setMenuStauts(int menuStauts) {
		this.menuStauts = menuStauts;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", storeId=" + storeId + ", menuName=" + menuName + ", menuPrice=" + menuPrice
				+ ", menuDescribe=" + menuDescribe + ", menuImg=" + menuImg + ", menuCreateTime=" + menuCreateTime
				+ ", menuUpdateTime=" + menuUpdateTime + ", menuStauts=" + menuStauts + "]";
	}
	
}
