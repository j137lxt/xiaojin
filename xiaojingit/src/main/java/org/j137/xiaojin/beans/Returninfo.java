package org.j137.xiaojin.beans;

import java.math.BigDecimal;

/**
 * 还款信息
 * @author Administrator
 * @version 1.0
 */
public class Returninfo {
	private long id;
	/**客户个人账户*/
	private String clientaccount;
	/**客户账户户行*/
	private String clientbank;
	/**首付金额*/
	private BigDecimal payment;
	/**价格*/
	private BigDecimal price;
	/**商品品牌*/
	private String shopbrand;
	/**商品型号*/
	private String shopmodel;
	/**商户外键*/
	private Store store;
	/**门店外键*/
	private Stores stores;
	/**活动代码*/
	private String activitycode;
	/**销售员姓名*/
	private String salesname;
	/**销售员电话*/
	private String salestelephone;

	public Returninfo(){

	}

	public Returninfo(String clientaccount, String clientbank, BigDecimal payment, BigDecimal price, String shopbrand,
			String shopmodel, Store store, Stores stores, String activitycode, String salesname,
			String salestelephone) {
		super();
		this.clientaccount = clientaccount;
		this.clientbank = clientbank;
		this.payment = payment;
		this.price = price;
		this.shopbrand = shopbrand;
		this.shopmodel = shopmodel;
		this.store = store;
		this.stores = stores;
		this.activitycode = activitycode;
		this.salesname = salesname;
		this.salestelephone = salestelephone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClientaccount() {
		return clientaccount;
	}

	public void setClientaccount(String clientaccount) {
		this.clientaccount = clientaccount;
	}

	public String getClientbank() {
		return clientbank;
	}

	public void setClientbank(String clientbank) {
		this.clientbank = clientbank;
	}

	public BigDecimal getPayment() {
		return payment;
	}

	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getShopbrand() {
		return shopbrand;
	}

	public void setShopbrand(String shopbrand) {
		this.shopbrand = shopbrand;
	}

	public String getShopmodel() {
		return shopmodel;
	}

	public void setShopmodel(String shopmodel) {
		this.shopmodel = shopmodel;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Stores getStores() {
		return stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	public String getActivitycode() {
		return activitycode;
	}

	public void setActivitycode(String activitycode) {
		this.activitycode = activitycode;
	}

	public String getSalesname() {
		return salesname;
	}

	public void setSalesname(String salesname) {
		this.salesname = salesname;
	}

	public String getSalestelephone() {
		return salestelephone;
	}

	public void setSalestelephone(String salestelephone) {
		this.salestelephone = salestelephone;
	}

	@Override
	public String toString() {
		return "Returninfo [id=" + id + ", clientaccount=" + clientaccount + ", clientbank=" + clientbank + ", payment="
				+ payment + ", price=" + price + ", shopbrand=" + shopbrand + ", shopmodel=" + shopmodel + ", store="
				+ store + ", stores=" + stores + ", activitycode=" + activitycode + ", salesname=" + salesname
				+ ", salestelephone=" + salestelephone + "]";
	}

	

}