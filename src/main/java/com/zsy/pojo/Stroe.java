package com.zsy.pojo;

public class Stroe {
	  private String store_id;
	  private String merchants_id;
	  private String store_name;
	  private String store_describe;
	  private String store_create_time;
	  private String store_update_time;
	  private int store_status;//店铺状态 0：正常 1：倒闭
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getMerchants_id() {
		return merchants_id;
	}
	public void setMerchants_id(String merchants_id) {
		this.merchants_id = merchants_id;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getStore_describe() {
		return store_describe;
	}
	public void setStore_describe(String store_describe) {
		this.store_describe = store_describe;
	}
	public String getStore_create_time() {
		return store_create_time;
	}
	public void setStore_create_time(String store_create_time) {
		this.store_create_time = store_create_time;
	}
	public String getStore_update_time() {
		return store_update_time;
	}
	public void setStore_update_time(String store_update_time) {
		this.store_update_time = store_update_time;
	}
	
	public int getStore_status() {
		return store_status;
	}
	public void setStore_status(int store_status) {
		this.store_status = store_status;
	}
	@Override
	public String toString() {
		return "Stroe [store_id=" + store_id + ", merchants_id=" + merchants_id + ", store_name=" + store_name
				+ ", store_describe=" + store_describe + ", store_create_time=" + store_create_time
				+ ", store_update_time=" + store_update_time + ", store_status=" + store_status + "]";
	}
	  
}
