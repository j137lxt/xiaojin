package org.j137.xiaojin.beans;


/**
 * ��������ס��Ϣ
 * @author Administrator
 * @version 1.0
 */
public class Addressinfo {
	private long id;
	/**������ַ*/
	private String address;
	/**�־ӵ�ַ*/
	private String addressNow;
	/**�ֵ�ַ��סʱ��*/
	private String addressTime;
	/**ס������*/
	private String house;
	/**�Ƿ�ͬ����*/
	private String iscensus;
	/**�����*/
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