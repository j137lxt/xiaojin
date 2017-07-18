package org.j137.xiaojin.beans;


/**
 * 商户地区
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 11:39:40
 */
public class StoreArea {
	/**归属营业部*/
	private String belongDepart;
	/**成都市*/
	private String city;
	/**城市经理*/
	private String cityManager;
	/**营业部经理*/
	private String departManager;
	/**商户地区id*/
	private Long id;
	/**省*/
	private String province;
	/**销售大区*/
	private String sellArea;
	/**销售部门*/
	private String sellDepart;

	

	public StoreArea() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void finalize() throws Throwable {

	}

	public String getBelongDepart() {
		return belongDepart;
	}

	public void setBelongDepart(String belongDepart) {
		this.belongDepart = belongDepart;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityManager() {
		return cityManager;
	}

	public void setCityManager(String cityManager) {
		this.cityManager = cityManager;
	}

	public String getDepartManager() {
		return departManager;
	}

	public void setDepartManager(String departManager) {
		this.departManager = departManager;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getSellArea() {
		return sellArea;
	}

	public void setSellArea(String sellArea) {
		this.sellArea = sellArea;
	}

	public String getSellDepart() {
		return sellDepart;
	}

	public void setSellDepart(String sellDepart) {
		this.sellDepart = sellDepart;
	}

	public StoreArea(String belongDepart, String city, String cityManager, String departManager, 
			String province, String sellArea, String sellDepart) {
		super();
		this.belongDepart = belongDepart;
		this.city = city;
		this.cityManager = cityManager;
		this.departManager = departManager;
	
		this.province = province;
		this.sellArea = sellArea;
		this.sellDepart = sellDepart;
	}

	@Override
	public String toString() {
		return "StoreArea [belongDepart=" + belongDepart + ", city=" + city + ", cityManager=" + cityManager
				+ ", departManager=" + departManager + ", id=" + id + ", province=" + province + ", sellArea="
				+ sellArea + ", sellDepart=" + sellDepart + "]";
	}
	
	

}