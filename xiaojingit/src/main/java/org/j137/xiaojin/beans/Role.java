package org.j137.xiaojin.beans;


/**
 * ½ÇÉ«
 * @author Administrator
 * @version 1.0
 * @created 13-7ÔÂ-2017 11:39:40
 */
public class Role {

	private Integer exist;
	private Long id;
	private Organization organization;
	private String roleCode;
	private String roleName;
	private String roleType;
	private String state;

	public Role(){

	}

	public void finalize() throws Throwable {

	}

	public Integer getExist() {
		return exist;
	}

	public void setExist(Integer exist) {
		this.exist = exist;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Role [exist=" + exist + ", id=" + id + ", organization=" + organization + ", roleCode=" + roleCode
				+ ", roleName=" + roleName + ", roleType=" + roleType + ", state=" + state + "]";
	}
	
}