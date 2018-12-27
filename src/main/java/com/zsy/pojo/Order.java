package com.zsy.pojo;

public class Order {
	  private String order_id;
	  private String user_id;
	  private String merchants_id;
	  private String menu_id;
	  private String shr_name;
	  private String order_phone;
	  private String address;
	  private String note;
	  private String order_create_time;
	  private String order_update_time;
	  private int order_status;//订单状态 0：未支付，1：已支付
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getMerchants_id() {
		return merchants_id;
	}
	public void setMerchants_id(String merchants_id) {
		this.merchants_id = merchants_id;
	}
	public String getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}
	public String getShr_name() {
		return shr_name;
	}
	public void setShr_name(String shr_name) {
		this.shr_name = shr_name;
	}
	public String getOrder_phone() {
		return order_phone;
	}
	public void setOrder_phone(String order_phone) {
		this.order_phone = order_phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getOrder_create_time() {
		return order_create_time;
	}
	public void setOrder_create_time(String order_create_time) {
		this.order_create_time = order_create_time;
	}
	public String getOrder_update_time() {
		return order_update_time;
	}
	public void setOrder_update_time(String order_update_time) {
		this.order_update_time = order_update_time;
	}
	
	public int getOrder_status() {
		return order_status;
	}
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", user_id=" + user_id + ", merchants_id=" + merchants_id + ", menu_id="
				+ menu_id + ", shr_name=" + shr_name + ", order_phone=" + order_phone + ", address=" + address
				+ ", note=" + note + ", order_create_time=" + order_create_time + ", order_update_time="
				+ order_update_time + ", order_status=" + order_status + "]";
	}
	  
	  
}
