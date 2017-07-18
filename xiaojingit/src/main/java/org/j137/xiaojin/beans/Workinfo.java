package org.j137.xiaojin.beans;


/**
 * ������Ϣ��
 * @author Administrator
 * @version 1.0
 * @updated 12-7��-2017 17:29:50
 */
public class Workinfo {
	private long id;
	/**�ͻ�ְλ*/
	private String clientjob;
	/**�ͻ�����*/
	private String clienttype;
	/**��ְ����*/
	private String partment;
	/**��λ��ַ*/
	private String unitaddress;
	/**�ֵ�λ����ʱ��*/
	private String unitdatetime;
	/**��λ����*/
	private String unitname;
	/**��λ��ϵ��ְλ*/
	private String unitpersonjob;
	/**��λ����*/
	private String unitquality;
	/**��λ��ģ*/
	private int unitscale;
	/**��λ����*/
	private String unittelname;
	/**��λ��ϵ�˵绰*/
	private String unittelperson;
	/**��λ�绰*/
	private String unittelphone;
	/**������ҵ*/
	private String unittrade;
	
	public Workinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Workinfo(String clientjob, String clienttype, String partment, String unitaddress, String unitdatetime,
			String unitname, String unitpersonjob, String unitquality, int unitscale, String unittelname,
			String unittelperson, String unittelphone, String unittrade) {
		super();
		this.clientjob = clientjob;
		this.clienttype = clienttype;
		this.partment = partment;
		this.unitaddress = unitaddress;
		this.unitdatetime = unitdatetime;
		this.unitname = unitname;
		this.unitpersonjob = unitpersonjob;
		this.unitquality = unitquality;
		this.unitscale = unitscale;
		this.unittelname = unittelname;
		this.unittelperson = unittelperson;
		this.unittelphone = unittelphone;
		this.unittrade = unittrade;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClientjob() {
		return clientjob;
	}
	public void setClientjob(String clientjob) {
		this.clientjob = clientjob;
	}
	public String getClienttype() {
		return clienttype;
	}
	public void setClienttype(String clienttype) {
		this.clienttype = clienttype;
	}
	public String getPartment() {
		return partment;
	}
	public void setPartment(String partment) {
		this.partment = partment;
	}
	public String getUnitaddress() {
		return unitaddress;
	}
	public void setUnitaddress(String unitaddress) {
		this.unitaddress = unitaddress;
	}
	public String getUnitdatetime() {
		return unitdatetime;
	}
	public void setUnitdatetime(String unitdatetime) {
		this.unitdatetime = unitdatetime;
	}
	public String getUnitname() {
		return unitname;
	}
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	public String getUnitpersonjob() {
		return unitpersonjob;
	}
	public void setUnitpersonjob(String unitpersonjob) {
		this.unitpersonjob = unitpersonjob;
	}
	public String getUnitquality() {
		return unitquality;
	}
	public void setUnitquality(String unitquality) {
		this.unitquality = unitquality;
	}
	public int getUnitscale() {
		return unitscale;
	}
	public void setUnitscale(int unitscale) {
		this.unitscale = unitscale;
	}
	public String getUnittelname() {
		return unittelname;
	}
	public void setUnittelname(String unittelname) {
		this.unittelname = unittelname;
	}
	public String getUnittelperson() {
		return unittelperson;
	}
	public void setUnittelperson(String unittelperson) {
		this.unittelperson = unittelperson;
	}
	public String getUnittelphone() {
		return unittelphone;
	}
	public void setUnittelphone(String unittelphone) {
		this.unittelphone = unittelphone;
	}
	public String getUnittrade() {
		return unittrade;
	}
	public void setUnittrade(String unittrade) {
		this.unittrade = unittrade;
	}
	
	@Override
	public String toString() {
		return "Workinfo [id=" + id + ", clientjob=" + clientjob + ", clienttype=" + clienttype + ", partment="
				+ partment + ", unitaddress=" + unitaddress + ", unitdatetime=" + unitdatetime + ", unitname="
				+ unitname + ", unitpersonjob=" + unitpersonjob + ", unitquality=" + unitquality + ", unitscale="
				+ unitscale + ", unittelname=" + unittelname + ", unittelperson=" + unittelperson + ", unittelphone="
				+ unittelphone + ", unittrade=" + unittrade + "]";
	}

	

}