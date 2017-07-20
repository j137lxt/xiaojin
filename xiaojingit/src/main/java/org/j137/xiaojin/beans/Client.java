package org.j137.xiaojin.beans;
/**
 * 客户
 * @author Administrator
 *
 */
public class Client {
	
	/**基础信息*/
	private Baseinfo baseinfo;
	
	private Long id;
	/**住址信息*/
	private Addressinfo addressinfo;
	/**家庭信息*/
	private Familyinfo familyinfo;
	/**工作信息*/
	private Workinfo workinfo;
	/**其他信息*/
	private Otherinfo otherinfo;
	/**还款信息*/
	private Returninfo returninfo;
	/**备注信息*/
	private Remarkinfo remarkinfo;
	public Baseinfo getBaseinfo() {
		return baseinfo;
	}
	public void setBaseinfo(Baseinfo baseinfo) {
		this.baseinfo = baseinfo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Addressinfo getAddressinfo() {
		return addressinfo;
	}
	public void setAddressinfo(Addressinfo addressinfo) {
		this.addressinfo = addressinfo;
	}
	public Familyinfo getFamilyinfo() {
		return familyinfo;
	}
	public void setFamilyinfo(Familyinfo familyinfo) {
		this.familyinfo = familyinfo;
	}
	public Workinfo getWorkinfo() {
		return workinfo;
	}
	public void setWorkinfo(Workinfo workinfo) {
		this.workinfo = workinfo;
	}
	public Otherinfo getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(Otherinfo otherinfo) {
		this.otherinfo = otherinfo;
	}
	public Returninfo getReturninfo() {
		return returninfo;
	}
	public void setReturninfo(Returninfo returninfo) {
		this.returninfo = returninfo;
	}
	public Remarkinfo getRemarkinfo() {
		return remarkinfo;
	}
	public void setRemarkinfo(Remarkinfo remarkinfo) {
		this.remarkinfo = remarkinfo;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Client [baseinfo=" + baseinfo + ", id=" + id + ", returninfo=" + returninfo + "]";
	}
	
	
	
}
