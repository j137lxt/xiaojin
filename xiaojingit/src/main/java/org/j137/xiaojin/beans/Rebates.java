package org.j137.xiaojin.beans;

import java.util.Date;

/**
 * 返点对象
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 11:39:39
 */
public class Rebates {
	/*创建时间*/
	private Date date;
	/*是否禁用*/
	private Long disable;
	/*创建人*/
	private User founder;
	/*返回对象id、*/
	private Long id;
	/*饭店对象*/
	private String objcet;
	/*产品对象*/
	private Product product;
	/*返点率*/
	private String rebatesRate;
	/*饭店类型*/
	private String type;

	public Rebates(){

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getDisable() {
		return disable;
	}

	public void setDisable(Long disable) {
		this.disable = disable;
	}

	public User getFounder() {
		return founder;
	}

	public void setFounder(User founder) {
		this.founder = founder;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getObjcet() {
		return objcet;
	}

	public void setObjcet(String objcet) {
		this.objcet = objcet;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getRebatesRate() {
		return rebatesRate;
	}

	public void setRebatesRate(String rebatesRate) {
		this.rebatesRate = rebatesRate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Rebates(Date date, Long disable, User founder, String objcet,
			Product product, String rebatesRate, String type) {
		super();
		this.date = date;
		this.disable = disable;
		this.founder = founder;
		this.objcet = objcet;
		this.product = product;
		this.rebatesRate = rebatesRate;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Rebates [date=" + date + ", disable=" + disable + ", founder="
				+ founder + ", id=" + id + ", objcet=" + objcet + ", product="
				+ product + ", rebatesRate=" + rebatesRate + ", type=" + type
				+ "]";
	}

	
	
	
	
	
}