package com.zsy.pojo;
/**
 * 商家
 * @author Administrator
 *
 */
public class Merchants {
	  private String merchantsId;
	  private String merchantsName;
	  private String merchantsSfz;
	  private String merchantsPhone;
	  private int merchantsAge;
	  private String merchantsEamil;
	  private String merchantsCreateTime;
	  private String merchantsUpdateTime;
	  private int merchantsStatus;//'商家状态 0：正常 1：注销
	public String getMerchantsId() {
		return merchantsId;
	}
	public void setMerchantsId(String merchantsId) {
		this.merchantsId = merchantsId;
	}
	public String getMerchantsName() {
		return merchantsName;
	}
	public void setMerchantsName(String merchantsName) {
		this.merchantsName = merchantsName;
	}
	public String getMerchantsSfz() {
		return merchantsSfz;
	}
	public void setMerchantsSfz(String merchantsSfz) {
		this.merchantsSfz = merchantsSfz;
	}
	public String getMerchantsPhone() {
		return merchantsPhone;
	}
	public void setMerchantsPhone(String merchantsPhone) {
		this.merchantsPhone = merchantsPhone;
	}
	public int getMerchantsAge() {
		return merchantsAge;
	}
	public void setMerchantsAge(int merchantsAge) {
		this.merchantsAge = merchantsAge;
	}
	public String getMerchantsEamil() {
		return merchantsEamil;
	}
	public void setMerchantsEamil(String merchantsEamil) {
		this.merchantsEamil = merchantsEamil;
	}
	public String getMerchantsCreateTime() {
		return merchantsCreateTime;
	}
	public void setMerchantsCreateTime(String merchantsCreateTime) {
		this.merchantsCreateTime = merchantsCreateTime;
	}
	public String getMerchantsUpdateTime() {
		return merchantsUpdateTime;
	}
	public void setMerchantsUpdateTime(String merchantsUpdateTime) {
		this.merchantsUpdateTime = merchantsUpdateTime;
	}
	public int getMerchantsStatus() {
		return merchantsStatus;
	}
	public void setMerchantsStatus(int merchantsStatus) {
		this.merchantsStatus = merchantsStatus;
	}
	@Override
	public String toString() {
		return "Merchants [merchantsId=" + merchantsId + ", merchantsName=" + merchantsName + ", merchantsSfz="
				+ merchantsSfz + ", merchantsPhone=" + merchantsPhone + ", merchantsAge=" + merchantsAge
				+ ", merchantsEamil=" + merchantsEamil + ", merchantsCreateTime=" + merchantsCreateTime
				+ ", merchantsUpdateTime=" + merchantsUpdateTime + ", merchantsStatus=" + merchantsStatus + "]";
	}
	
	  
}
