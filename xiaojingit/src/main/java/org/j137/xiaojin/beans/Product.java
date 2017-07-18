package org.j137.xiaojin.beans;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ��Ʒ
 * @author Administrator
 * @version 1.0
 * @created 13-7��-2017 11:39:+++++++++39
 */
public class Product {


	private Long id;
	/*��ǰ�������� */
	private String advanceService;
	/* ʹ����Ʒ����*/
	private String appcomtype;
	/* ����״̬*/
	private String buffer="δͨ��";
	/* ���ϵ��*/
	private BigDecimal commission;
	/* �Ƿ�ǿ�Ʊ���*/
	private long compulsoryInsurance;
	/*����ʱ�� */
	private Date createrdate=new Date(System.currentTimeMillis());
	/* �Ƿ�ǿ����Ȩ��*/
	private long forcedPrivilege;
	/* ��ʼ��*/
	private User founder;
	/*������ */
	private String interestRate;
	/*������ */
	private String maxloan;
	/* ��С���*/
	private String minloan;
	/* ��Ȩ����*/
	private String privilegedService;
	/* ��Ʒ����*/
	private String productName;
	/* ��Ʒ����*/
	private String productType;
	/* ������*/
	private BigDecimal rebatesRate;
	/*�޸�ʱ�� */
	private Date updatedate=new Date(System.currentTimeMillis());
	/* �޸���*/
	private User updateMan;
	/*������󼯺�*/
	private List<Rebates> fandian;
	/*��������*/
	private List<Nper> qishu;
	public Product(){

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdvanceService() {
		return advanceService;
	}
	public void setAdvanceService(String advanceService) {
		this.advanceService = advanceService;
	}
	public String getAppcomtype() {
		return appcomtype;
	}
	public void setAppcomtype(String appcomtype) {
		this.appcomtype = appcomtype;
	}
	public String getBuffer() {
		return buffer;
	}
	public void setBuffer(String buffer) {
		this.buffer = buffer;
	}
	public BigDecimal getCommission() {
		return commission;
	}
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}
	public long getCompulsoryInsurance() {
		return compulsoryInsurance;
	}
	public void setCompulsoryInsurance(long compulsoryInsurance) {
		this.compulsoryInsurance = compulsoryInsurance;
	}
	public Date getCreaterdate() {
		return createrdate;
	}
	public void setCreaterdate(Date createrdate) {
		this.createrdate = createrdate;
	}
	public long getForcedPrivilege() {
		return forcedPrivilege;
	}
	public void setForcedPrivilege(long forcedPrivilege) {
		this.forcedPrivilege = forcedPrivilege;
	}
	public User getFounder() {
		return founder;
	}
	public void setFounder(User founder) {
		this.founder = founder;
	}
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public String getMaxloan() {
		return maxloan;
	}
	public void setMaxloan(String maxloan) {
		this.maxloan = maxloan;
	}
	public String getMinloan() {
		return minloan;
	}
	public void setMinloan(String minloan) {
		this.minloan = minloan;
	}
	public String getPrivilegedService() {
		return privilegedService;
	}
	public void setPrivilegedService(String privilegedService) {
		this.privilegedService = privilegedService;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public BigDecimal getRebatesRate() {
		return rebatesRate;
	}
	public void setRebatesRate(BigDecimal rebatesRate) {
		this.rebatesRate = rebatesRate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public User getUpdateMan() {
		return updateMan;
	}
	public void setUpdateMan(User updateMan) {
		this.updateMan = updateMan;
	}
	public List<Rebates> getFandian() {
		return fandian;
	}
	public void setFandian(List<Rebates> fandian) {
		this.fandian = fandian;
	}
	public List<Nper> getQishu() {
		return qishu;
	}
	public void setQishu(List<Nper> qishu) {
		this.qishu = qishu;
	}
	public Product( String advanceService, String appcomtype,
			String buffer, BigDecimal commission, long compulsoryInsurance,
			Date createrdate, long forcedPrivilege, User founder,
			String interestRate, String maxloan, String minloan,
			String privilegedService, String productName, String productType,
			BigDecimal rebatesRate, Date updatedate, User updateMan,
			List<Rebates> fandian, List<Nper> qishu) {

	
		this.advanceService = advanceService;
		this.appcomtype = appcomtype;
		this.buffer = buffer;
		this.commission = commission;
		this.compulsoryInsurance = compulsoryInsurance;
		this.createrdate = createrdate;
		this.forcedPrivilege = forcedPrivilege;
		this.founder = founder;
		this.interestRate = interestRate;
		this.maxloan = maxloan;
		this.minloan = minloan;
		this.privilegedService = privilegedService;
		this.productName = productName;
		this.productType = productType;
		this.rebatesRate = rebatesRate;
		this.updatedate = updatedate;
		this.updateMan = updateMan;
		this.fandian = fandian;
		this.qishu = qishu;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", advanceService=" + advanceService
				+ ", appcomtype=" + appcomtype + ", buffer=" + buffer
				+ ", commission=" + commission + ", compulsoryInsurance="
				+ compulsoryInsurance + ", createrdate=" + createrdate
				+ ", forcedPrivilege=" + forcedPrivilege + ", founder="
				+ founder + ", interestRate=" + interestRate + ", maxloan="
				+ maxloan + ", minloan=" + minloan + ", privilegedService="
				+ privilegedService + ", productName=" + productName
				+ ", productType=" + productType + ", rebatesRate="
				+ rebatesRate + ", updatedate=" + updatedate + ", updateMan="
				+ updateMan + ", fandian=" + fandian + ", qishu=" + qishu + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}