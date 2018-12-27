package com.zsy.pojo;

public class Store {
	  private String storeId;
	  private String merchantsId;
	  private String storeName;
	  private String storeDescribe;
	  private String storeCreateTime;
	  private String storeUpdateTime;
	  private int storeStatus;//店铺状态 0：正常 1：倒闭
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getMerchantsId() {
		return merchantsId;
	}
	public void setMerchantsId(String merchantsId) {
		this.merchantsId = merchantsId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreDescribe() {
		return storeDescribe;
	}
	public void setStoreDescribe(String storeDescribe) {
		this.storeDescribe = storeDescribe;
	}
	public String getStoreCreateTime() {
		return storeCreateTime;
	}
	public void setStoreCreateTime(String storeCreateTime) {
		this.storeCreateTime = storeCreateTime;
	}
	public String getStoreUpdateTime() {
		return storeUpdateTime;
	}
	public void setStoreUpdateTime(String storeUpdateTime) {
		this.storeUpdateTime = storeUpdateTime;
	}
	public int getStoreStatus() {
		return storeStatus;
	}
	public void setStoreStatus(int storeStatus) {
		this.storeStatus = storeStatus;
	}
	@Override
	public String toString() {
		return "Stroe [storeId=" + storeId + ", merchantsId=" + merchantsId + ", storeName=" + storeName
				+ ", storeDescribe=" + storeDescribe + ", storeCreateTime=" + storeCreateTime + ", storeUpdateTime="
				+ storeUpdateTime + ", storeStatus=" + storeStatus + "]";
	}
	
	  
}
