package org.j137.xiaojin.beans;


/**
 * 户籍及居住信息
 * @author Administrator
 * @version 1.0
 */
public class Addressinfo {
	private long id;
	/**户籍地址*/
	private String address;
	/**现居地址*/
	private String addressNow;
	/**现地址居住时间*/
	private String addressTime;
	/**住房性质*/
	private String house;
	/**是否同户籍*/
	private String iscensus;
	/**月租金*/
	private double monthTicket;
	
	public Addressinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Addressinfo(String address, String addressNow, String addressTime, String house, String iscensus,
			double monthTicket) {
		super();
		this.address = address;
		this.addressNow = addressNow;
		this.addressTime = addressTime;
		this.house = house;
		this.iscensus = iscensus;
		this.monthTicket = monthTicket;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressNow() {
		return addressNow;
	}
	public void setAddressNow(String addressNow) {
		this.addressNow = addressNow;
	}
	public String getAddressTime() {
		return addressTime;
	}
	public void setAddressTime(String addressTime) {
		this.addressTime = addressTime;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getIscensus() {
		return iscensus;
	}
	public void setIscensus(String iscensus) {
		this.iscensus = iscensus;
	}
	public double getMonthTicket() {
		return monthTicket;
	}
	public void setMonthTicket(double monthTicket) {
		this.monthTicket = monthTicket;
	}
	@Override
	public String toString() {
		return "Addressinfo [address=" + address + ", addressNow=" + addressNow + ", addressTime=" + addressTime
				+ ", house=" + house + ", id=" + id + ", iscensus=" + iscensus + ", monthTicket=" + monthTicket + "]";
	}

	
}