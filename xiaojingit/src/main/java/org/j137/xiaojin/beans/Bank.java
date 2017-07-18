package org.j137.xiaojin.beans;

import java.util.Date;

/**
 * ����
 * @author Administrator
 * @version 1.0
 * @updated 12-7��-2017 17:29:46
 */
public class Bank {

	private String accountType;
	private String bankName;
	private String dobankName;
	private Date doTime;
	private String employeesNumber;
	private String employeesUpdate;
	private Long id;
	private String number;
	private Date updateTime;
	private String workName;
	private String yesNo;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getDobankName() {
		return dobankName;
	}
	public void setDobankName(String dobankName) {
		this.dobankName = dobankName;
	}
	public Date getDoTime() {
		return doTime;
	}
	public void setDoTime(Date doTime) {
		this.doTime = doTime;
	}
	public String getEmployeesNumber() {
		return employeesNumber;
	}
	public void setEmployeesNumber(String employeesNumber) {
		this.employeesNumber = employeesNumber;
	}
	public String getEmployeesUpdate() {
		return employeesUpdate;
	}
	public void setEmployeesUpdate(String employeesUpdate) {
		this.employeesUpdate = employeesUpdate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public String getYesNo() {
		return yesNo;
	}
	public void setYesNo(String yesNo) {
		this.yesNo = yesNo;
	}
	@Override
	public String toString() {
		return "Bank [accountType=" + accountType + ", bankName=" + bankName + ", dobankName=" + dobankName
				+ ", doTime=" + doTime + ", employeesNumber=" + employeesNumber + ", employeesUpdate=" + employeesUpdate
				+ ", id=" + id + ", number=" + number + ", updateTime=" + updateTime + ", workName=" + workName
				+ ", yesNo=" + yesNo + "]";
	}


}