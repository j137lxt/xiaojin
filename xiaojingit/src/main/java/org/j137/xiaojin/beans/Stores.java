package org.j137.xiaojin.beans;


/**
 * 锟脚碉拷
 * @author Administrator
 * @version 1.0
 * @updated 12-7锟斤拷-2017 17:29:50
 */
public class Stores {

	private String area;
	private String city;
	private String goods;
	private Long id;
	private String note;
	private String people;
	private String phone;
	private String position;
	private String province;
	private String state;
	private String stores_address;
	private String stores_area;
	private String stores_name;
	private Store store;//商户实体Bean
	private Salesman salesman; //销售员实体Bean
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStores_address() {
		return stores_address;
	}
	public void setStores_address(String stores_address) {
		this.stores_address = stores_address;
	}
	public String getStores_area() {
		return stores_area;
	}
	public void setStores_area(String stores_area) {
		this.stores_area = stores_area;
	}
	public String getStores_name() {
		return stores_name;
	}
	public void setStores_name(String stores_name) {
		this.stores_name = stores_name;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Salesman getSalesman() {
		return salesman;
	}
	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}
	@Override
	public String toString() {
		return "Stores [area=" + area + ", city=" + city + ", goods=" + goods + ", id=" + id + ", note=" + note
				+ ", people=" + people + ", phone=" + phone + ", position=" + position + ", province=" + province
				+ ", state=" + state + ", stores_address=" + stores_address + ", stores_area=" + stores_area
				+ ", stores_name=" + stores_name + ", store=" + store + ", salesman=" + salesman + "]";
	}
	public Stores() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}