package org.j137.xiaojin.beans;

import java.math.BigDecimal;

/**
 * ������Ϣ��
 * @author Administrator
 * @version 1.0
 */
public class Otherinfo {
	private int id;
	/**�ܽ����̶�*/
	private String culture;
	/**�����ʼ�*/
	private String email;
	/**�Ƿ��������Ʒ���ҵ��*/
	private String ishandle;
	/**������*/
	private long monthincome;
	/**�»������У�*/
	private long returnmoney;

	public Otherinfo(){

	}

	public Otherinfo(String culture, String email, String ishandle, long monthincome, long returnmoney) {
		super();
		this.culture = culture;
		this.email = email;
		this.ishandle = ishandle;
		this.monthincome = monthincome;
		this.returnmoney = returnmoney;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCulture() {
		return culture;
	}

	public void setCulture(String culture) {
		this.culture = culture;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIshandle() {
		return ishandle;
	}

	public void setIshandle(String ishandle) {
		this.ishandle = ishandle;
	}

	public long getMonthincome() {
		return monthincome;
	}

	public void setMonthincome(long monthincome) {
		this.monthincome = monthincome;
	}

	public long getReturnmoney() {
		return returnmoney;
	}

	public void setReturnmoney(long returnmoney) {
		this.returnmoney = returnmoney;
	}

	@Override
	public String toString() {
		return "Otherinfo [id=" + id + ", culture=" + culture + ", email=" + email + ", ishandle=" + ishandle
				+ ", monthincome=" + monthincome + ", returnmoney=" + returnmoney + "]";
	}
}