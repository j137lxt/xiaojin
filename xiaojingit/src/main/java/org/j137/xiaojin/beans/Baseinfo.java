package org.j137.xiaojin.beans;


/**
 * 基本信息�?
 * @author Administrator
 * @version 1.0
 */
public class Baseinfo {
	private long id;
	/** 住宅电话*/
	private String addrTel;
	/** 证件号码*/
	private String cardnumber;
	/** 证件类型*/
	private String cardtype;
	/** 户籍类型*/
	private String census;
	/**发证机关*/
	private String credentials;
	/**是否实名登记*/
	private String isregister;
	/**姓名*/
	private String name;
	/**民族*/
	private String nation;
	/**QQ*/
	private String qq;
	/**性别*/
	private String sex;
	/**每月平均消费话费*/
	private String telFare;
	/**信宅电话登记�?*/
	private String telName;
	/**手机号码*/
	private String telphone;
	/**手机号使用年限（月）*/
	private int telUseDate;
	/**有效�?*/
	private String validate;
	/**微信*/
	private String wechat;
	
	public Baseinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Baseinfo(String addrTel, String cardnumber, String cardtype, String census, String credentials,
			String isregister, String name, String nation, String qq, String sex, String telFare, String telName,
			String telphone, int telUseDate, String validate, String wechat) {
		super();
		this.addrTel = addrTel;
		this.cardnumber = cardnumber;
		this.cardtype = cardtype;
		this.census = census;
		this.credentials = credentials;
		this.isregister = isregister;
		this.name = name;
		this.nation = nation;
		this.qq = qq;
		this.sex = sex;
		this.telFare = telFare;
		this.telName = telName;
		this.telphone = telphone;
		this.telUseDate = telUseDate;
		this.validate = validate;
		this.wechat = wechat;
	}
	public String getAddrTel() {
		return addrTel;
	}
	public void setAddrTel(String addrTel) {
		this.addrTel = addrTel;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getCensus() {
		return census;
	}
	public void setCensus(String census) {
		this.census = census;
	}
	public String getCredentials() {
		return credentials;
	}
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsregister() {
		return isregister;
	}
	public void setIsregister(String isregister) {
		this.isregister = isregister;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelFare() {
		return telFare;
	}
	public void setTelFare(String telFare) {
		this.telFare = telFare;
	}
	public String getTelName() {
		return telName;
	}
	public void setTelName(String telName) {
		this.telName = telName;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public int getTelUseDate() {
		return telUseDate;
	}
	public void setTelUseDate(int telUseDate) {
		this.telUseDate = telUseDate;
	}
	public String getValidate() {
		return validate;
	}
	public void setValidate(String validate) {
		this.validate = validate;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	@Override
	public String toString() {
		return "Baseinfo [addrTel=" + addrTel + ", cardnumber=" + cardnumber + ", cardtype=" + cardtype + ", census="
				+ census + ", credentials=" + credentials + ", id=" + id + ", isregister=" + isregister + ", name="
				+ name + ", nation=" + nation + ", qq=" + qq + ", sex=" + sex + ", telFare=" + telFare + ", telName="
				+ telName + ", telphone=" + telphone + ", telUseDate=" + telUseDate + ", validate=" + validate
				+ ", wechat=" + wechat + "]";
	}

	

}