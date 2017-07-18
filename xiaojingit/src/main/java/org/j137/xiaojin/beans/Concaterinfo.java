package org.j137.xiaojin.beans;
/**
 * 联系人表
 * @author Administrator
 *
 */
public class Concaterinfo {
	private long id;
	/**联系人姓名*/
	private String name;
	/**关系*/
	private String relationship;
	/**联系方式*/
	private String telphone;
	public Concaterinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Concaterinfo( String name, String relationship, String telphone) {
		super();
		this.name = name;
		this.relationship = relationship;
		this.telphone = telphone;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	@Override
	public String toString() {
		return "Concater [id=" + id + ", name=" + name + ", relationship=" + relationship + ", telphone=" + telphone
				+ "]";
	}
	
	
}
