package com.zsy.pojo;

import java.io.Serializable;

public class ProductOrder implements Serializable  {
	  private String orderId;
	  private String userId;
	  private String merchantsId;
	  private String menuId;
	  private int orderNum;//购买数量
	  private Double orderPrice;
	  private String shrName;
	  private String orderPhone;
	  private String address;
	  private String note;
	  private String orderCreateTime;
	  private String orderUpdateTime;
	  private int orderStatus;//订单状态 0：未支付，1：已支付
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMerchantsId() {
		return merchantsId;
	}
	public void setMerchantsId(String merchantsId) {
		this.merchantsId = merchantsId;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getShrName() {
		return shrName;
	}
	public void setShrName(String shrName) {
		this.shrName = shrName;
	}
	public String getOrderPhone() {
		return orderPhone;
	}
	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
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
	public String getOrderCreateTime() {
		return orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}
	public String getOrderUpdateTime() {
		return orderUpdateTime;
	}
	public void setOrderUpdateTime(String orderUpdateTime) {
		this.orderUpdateTime = orderUpdateTime;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public Double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}
	@Override
	public String toString() {
		return "ProductOrder [orderId=" + orderId + ", userId=" + userId + ", merchantsId=" + merchantsId + ", menuId="
				+ menuId + ", orderNum=" + orderNum + ", orderPrice=" + orderPrice + ", shrName=" + shrName
				+ ", orderPhone=" + orderPhone + ", address=" + address + ", note=" + note + ", orderCreateTime="
				+ orderCreateTime + ", orderUpdateTime=" + orderUpdateTime + ", orderStatus=" + orderStatus + "]";
	}
	
	
	  
	  
}
