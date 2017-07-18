package org.j137.xiaojin.beans;


/**
 * ����Ա
 * @author Administrator
 * @version 1.0
 * @created 13-7��-2017 11:39:40
 */
public class Salesman {

	private String employeesid;
	private String employeesstate;
	private Long id;
	private String saleid;
	private String salename;
	private String salephone;
	private String salestate;
	private String organizationName;
	public Salesman() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeesid() {
		return employeesid;
	}
	public void setEmployeesid(String employeesid) {
		this.employeesid = employeesid;
	}
	public String getEmployeesstate() {
		return employeesstate;
	}
	public void setEmployeesstate(String employeesstate) {
		this.employeesstate = employeesstate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSaleid() {
		return saleid;
	}
	public void setSaleid(String saleid) {
		this.saleid = saleid;
	}
	public String getSalename() {
		return salename;
	}
	public void setSalename(String salename) {
		this.salename = salename;
	}
	public String getSalephone() {
		return salephone;
	}
	public void setSalephone(String salephone) {
		this.salephone = salephone;
	}
	public String getSalestate() {
		return salestate;
	}
	public void setSalestate(String salestate) {
		this.salestate = salestate;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	@Override
	public String toString() {
		return "Salesman [employeesid=" + employeesid + ", employeesstate=" + employeesstate + ", id=" + id
				+ ", saleid=" + saleid + ", salename=" + salename + ", salephone=" + salephone + ", salestate="
				+ salestate + ", organizationName=" + organizationName + "]";
	}

	

}