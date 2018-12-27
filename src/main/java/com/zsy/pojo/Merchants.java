package com.zsy.pojo;
/**
 * 商家
 * @author Administrator
 *
 */
public class Merchants {
	  private String merchants_id;
	  private String merchants_name;
	  private String merchants_sfz;
	  private String merchants_phone;
	  private int merchants_age;
	  private String merchants_eamil;
	  private String merchants_create_time;
	  private String merchants_update_time;
	  private int merchants_status;//'商家状态 0：正常 1：注销
	public String getMerchants_id() {
		return merchants_id;
	}
	public void setMerchants_id(String merchants_id) {
		this.merchants_id = merchants_id;
	}
	public String getMerchants_name() {
		return merchants_name;
	}
	public void setMerchants_name(String merchants_name) {
		this.merchants_name = merchants_name;
	}
	public String getMerchants_sfz() {
		return merchants_sfz;
	}
	public void setMerchants_sfz(String merchants_sfz) {
		this.merchants_sfz = merchants_sfz;
	}
	public String getMerchants_phone() {
		return merchants_phone;
	}
	public void setMerchants_phone(String merchants_phone) {
		this.merchants_phone = merchants_phone;
	}
	
	public String getMerchants_eamil() {
		return merchants_eamil;
	}
	public void setMerchants_eamil(String merchants_eamil) {
		this.merchants_eamil = merchants_eamil;
	}
	public String getMerchants_create_time() {
		return merchants_create_time;
	}
	public void setMerchants_create_time(String merchants_create_time) {
		this.merchants_create_time = merchants_create_time;
	}
	public String getMerchants_update_time() {
		return merchants_update_time;
	}
	public void setMerchants_update_time(String merchants_update_time) {
		this.merchants_update_time = merchants_update_time;
	}

	public int getMerchants_age() {
		return merchants_age;
	}
	public void setMerchants_age(int merchants_age) {
		this.merchants_age = merchants_age;
	}
	public int getMerchants_status() {
		return merchants_status;
	}
	public void setMerchants_status(int merchants_status) {
		this.merchants_status = merchants_status;
	}
	@Override
	public String toString() {
		return "Merchants [merchants_id=" + merchants_id + ", merchants_name=" + merchants_name + ", merchants_sfz="
				+ merchants_sfz + ", merchants_phone=" + merchants_phone + ", merchants_age=" + merchants_age
				+ ", merchants_eamil=" + merchants_eamil + ", merchants_create_time=" + merchants_create_time
				+ ", merchants_update_time=" + merchants_update_time + ", merchants_status=" + merchants_status + "]";
	}
	  
	  
}
