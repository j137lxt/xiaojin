package org.j137.xiaojin.beans;


/**
 * ��ͥ��Ϣ
 * @author Administrator
 * @version 1.0
 */
public class Familyinfo {
	private long id;
	/**��ͥ��Ա��ַ*/
	private String familyaddress;
	/**��ͥ��Ա����*/
	private String familyname;
	/**��ͥ��Ա�Ƿ�֪��*/
	private String isfamilyknow;
	/**����״̬*/
	private String marrystate;
	/**��ϵ*/
	private String relationship;
	/**��ż����*/
	private String spousename;
	/**��ż�绰*/
	private String spousetelphone;
	/**��ϵ�绰*/
	private String telphone;
	/**��ͥ��Ա��ס���Ƿ񻧼�*/
	private String iscensus;
	
	public Familyinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Familyinfo(String familyaddress, String familyname, String isfamilyknow, String marrystate,
			String relationship, String spousename, String spousetelphone, String telphone, String iscensus) {
		super();
		this.familyaddress = familyaddress;
		this.familyname = familyname;
		this.isfamilyknow = isfamilyknow;
		this.marrystate = marrystate;
		this.relationship = relationship;
		this.spousename = spousename;
		this.spousetelphone = spousetelphone;
		this.telphone = telphone;
		this.iscensus = iscensus;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFamilyaddress() {
		return familyaddress;
	}

	public void setFamilyaddress(String familyaddress) {
		this.familyaddress = familyaddress;
	}

	public String getFamilyname() {
		return familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

	public String getIsfamilyknow() {
		return isfamilyknow;
	}

	public void setIsfamilyknow(String isfamilyknow) {
		this.isfamilyknow = isfamilyknow;
	}

	public String getMarrystate() {
		return marrystate;
	}

	public void setMarrystate(String marrystate) {
		this.marrystate = marrystate;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getSpousename() {
		return spousename;
	}

	public void setSpousename(String spousename) {
		this.spousename = spousename;
	}

	public String getSpousetelphone() {
		return spousetelphone;
	}

	public void setSpousetelphone(String spousetelphone) {
		this.spousetelphone = spousetelphone;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getIscensus() {
		return iscensus;
	}

	public void setIscensus(String iscensus) {
		this.iscensus = iscensus;
	}


	@Override
	public String toString() {
		return "Familyinfo [id=" + id + ", familyaddress=" + familyaddress + ", familyname=" + familyname
				+ ", isfamilyknow=" + isfamilyknow + ", marrystate=" + marrystate + ", relationship=" + relationship
				+ ", spousename=" + spousename + ", spousetelphone=" + spousetelphone + ", telphone=" + telphone + "]";
	}

	
}