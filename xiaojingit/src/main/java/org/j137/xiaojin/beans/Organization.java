package org.j137.xiaojin.beans;


/**
 * »ú¹¹
 * @author Administrator
 * @version 1.0
 * @created 13-7ÔÂ-2017 11:39:39
 */
public class Organization {

	private Integer exist;
	private String grandOrg;
	private Long id;
	private String orgCode;
	private String orgName;
	private String remark;
	private int sort;
	private String state;

	public Organization(){

	}

	public void finalize() throws Throwable {

	}

	public Integer getExist() {
		return exist;
	}

	public void setExist(Integer exist) {
		this.exist = exist;
	}

	public String getGrandOrg() {
		return grandOrg;
	}

	public void setGrandOrg(String grandOrg) {
		this.grandOrg = grandOrg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Organization [exist=" + exist + ", grandOrg=" + grandOrg + ", id=" + id + ", orgCode=" + orgCode
				+ ", orgName=" + orgName + ", remark=" + remark + ", sort=" + sort + ", state=" + state + "]";
	}

}