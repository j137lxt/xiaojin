package org.j137.xiaojin.beans;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 产品
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 11:39:+++++++++39
 */
public class Product {


	private Long id;
	/*提前结算服务费 */
	private String advanceService;
	/* 使用商品类型*/
	private String appcomtype;
	/* 审批状态*/
	private String buffer="未通过";
	/* 提成系数*/
	private BigDecimal commission;
	/* 是否强制保险*/
	private long compulsoryInsurance;
	/*创建时间 */
	private Date createrdate=new Date(System.currentTimeMillis());
	/* 是否强制特权包*/
	private long forcedPrivilege;
	/* 创始人*/
	private User founder;
	/*年利率 */
	private String interestRate;
	/*最大贷款 */
	private String maxloan;
	/* 最小大款*/
	private String minloan;
	/* 特权服务*/
	private String privilegedService;
	/* 产品名字*/
	private String productName;
	/* 产品类型*/
	private String productType;
	/* 返点率*/
	private BigDecimal rebatesRate;
	/*修改时间 */
	private Date updatedate=new Date(System.currentTimeMillis());
	/* 修改人*/
	private User updateMan;
	/*返点对象集合*/
	private List<Rebates> fandian;
	/*期数对象*/
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