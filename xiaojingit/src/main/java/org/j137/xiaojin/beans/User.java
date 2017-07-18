package org.j137.xiaojin.beans;


/**
 * ÓÃ»§
 * @author Administrator
 * @version 1.0
 * @created 13-7ÔÂ-2017 11:39:40
 */
public class User {

	private String email;
	private Long id;
	private String idCard;
	private String loginName;
	private Organization organization;
	private String phone;
	private String relname;
	private String state;
	private String userCode;
	private Integer exist;
	private String genner;
	private String userType;

	public User(){

	}

	public void finalize() throws Throwable {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelname() {
		return relname;
	}

	public void setRelname(String relname) {
		this.relname = relname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public Integer getExist() {
		return exist;
	}

	public void setExist(Integer exist) {
		this.exist = exist;
	}

	public String getGenner() {
		return genner;
	}

	public void setGenner(String genner) {
		this.genner = genner;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", id=" + id + ", idCard=" + idCard + ", loginName=" + loginName
				+ ", organization=" + organization + ", phone=" + phone + ", relname=" + relname + ", state=" + state
				+ ", userCode=" + userCode + ", exist=" + exist + ", genner=" + genner + ", userType=" + userType + "]";
	}

}