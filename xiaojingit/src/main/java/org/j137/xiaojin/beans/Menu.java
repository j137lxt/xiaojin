package org.j137.xiaojin.beans;


/**
 * ²Ëµ¥
 * @author Administrator
 * @version 1.0
 * @created 13-7ÔÂ-2017 11:39:39
 */
public class Menu {

	private String authority;
	private String icon;
	private Long id;
	private String link;
	private String menuName;
	private String origin;
	private String remark;
	private int sort;
	private String state;
	private String grandMenu;
	private Integer exist;

	public Menu(){

	}

	public void finalize() throws Throwable {

	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
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

	public String getGrandMenu() {
		return grandMenu;
	}

	public void setGrandMenu(String grandMenu) {
		this.grandMenu = grandMenu;
	}

	public Integer getExist() {
		return exist;
	}

	public void setExist(Integer exist) {
		this.exist = exist;
	}

	@Override
	public String toString() {
		return "Menu [authority=" + authority + ", icon=" + icon + ", id=" + id + ", link=" + link + ", menuName="
				+ menuName + ", origin=" + origin + ", remark=" + remark + ", sort=" + sort + ", state=" + state
				+ ", grandMenu=" + grandMenu + ", exist=" + exist + "]";
	}
	
}