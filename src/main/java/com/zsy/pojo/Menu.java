package com.zsy.pojo;
/**
 * 菜单
 * @author Administrator
 *
 */
public class Menu {
	private String menu_id;
	private String store_id;
	private String menu_name;
	private Double menu_price;
	private String menu_describe;
	private String menu_img;
	private String menu_create_time;
	private String menu_update_time;
	private int menu_stauts;
	public String getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public Double getMenu_price() {
		return menu_price;
	}
	public void setMenu_price(Double menu_price) {
		this.menu_price = menu_price;
	}
	public String getMenu_describe() {
		return menu_describe;
	}
	public void setMenu_describe(String menu_describe) {
		this.menu_describe = menu_describe;
	}
	public String getMenu_img() {
		return menu_img;
	}
	public void setMenu_img(String menu_img) {
		this.menu_img = menu_img;
	}
	public String getMenu_create_time() {
		return menu_create_time;
	}
	public void setMenu_create_time(String menu_create_time) {
		this.menu_create_time = menu_create_time;
	}
	public String getMenu_update_time() {
		return menu_update_time;
	}
	public void setMenu_update_time(String menu_update_time) {
		this.menu_update_time = menu_update_time;
	}
	public int getMenu_stauts() {
		return menu_stauts;
	}
	public void setMenu_stauts(int menu_stauts) {
		this.menu_stauts = menu_stauts;
	}
	@Override
	public String toString() {
		return "Menu [menu_id=" + menu_id + ", store_id=" + store_id + ", menu_name=" + menu_name + ", menu_price="
				+ menu_price + ", menu_describe=" + menu_describe + ", menu_img=" + menu_img + ", menu_create_time="
				+ menu_create_time + ", menu_update_time=" + menu_update_time + ", menu_stauts=" + menu_stauts + "]";
	}
	
	
}
