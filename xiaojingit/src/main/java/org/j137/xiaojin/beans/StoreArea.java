package org.j137.xiaojin.beans;


/**
 * �̻�����
 * @author Administrator
 * @version 1.0
 * @created 13-7��-2017 11:39:40
 */
public class StoreArea {
	/**����Ӫҵ��*/
	private String belongDepart;
	/**�ɶ���*/
	private String city;
	/**���о���*/
	private String cityManager;
	/**Ӫҵ������*/
	private String departManager;
	/**�̻�����id*/
	private Long id;
	/**ʡ*/
	private String province;
	/**���۴���*/
	private String sellArea;
	/**���۲���*/
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