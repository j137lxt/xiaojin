package org.j137.xiaojin.beans;


/**
 * 商户附表
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 11:39:40
 */
public class Store2 {

	/**商户id*/
	private Long id;
	/**申请类型*/
	private String storeApplyType;
	/**营业执照编码*/
	private String storeCommercialCode;
	/**同行业竞争者*/
	private String storeCompetitor;
	/**法人身份证号*/
	private String storeIDCard;
	/**法人姓名*/
	private String storeManName;
	/**法人电话号码*/
	private String storeManTel;
	/**商户名称*/
	private String storeName;
	/**组织机构代码证号*/
	private String storeOrgCode;
	/**备注*/
	private String storeRemarks;
	/**负责人*/
	private String storeResponsibleMan;
	/**负责人手机号*/
	private String storeResTel;
	/**社会信用统一编码*/
	private String storeSocietyCode;
	/**税务登记账号*/
	private String storeTaxAccount;
	/**实际收款认姓名*/
	private String storeShijiName;
	/**实际收款人电话*/
	private String storeShijiTel;
	


	public Store2(String storeApplyType, String storeCommercialCode, String storeCompetitor, String storeIDCard,
			String storeManName, String storeManTel, String storeName, String storeOrgCode, String storeRemarks,
			String storeResponsibleMan, String storeResTel, String storeSocietyCode, String storeTaxAccount,
			String storeShijiName, String storeShijiTel) {
		super();
		this.storeApplyType = storeApplyType;
		this.storeCommercialCode = storeCommercialCode;
		this.storeCompetitor = storeCompetitor;
		this.storeIDCard = storeIDCard;
		this.storeManName = storeManName;
		this.storeManTel = storeManTel;
		this.storeName = storeName;
		this.storeOrgCode = storeOrgCode;
		this.storeRemarks = storeRemarks;
		this.storeResponsibleMan = storeResponsibleMan;
		this.storeResTel = storeResTel;
		this.storeSocietyCode = storeSocietyCode;
		this.storeTaxAccount = storeTaxAccount;
		this.storeShijiName = storeShijiName;
		this.storeShijiTel = storeShijiTel;
	}

	public Store2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void finalize() throws Throwable {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStoreApplyType() {
		return storeApplyType;
	}

	public void setStoreApplyType(String storeApplyType) {
		this.storeApplyType = storeApplyType;
	}

	public String getStoreCommercialCode() {
		return storeCommercialCode;
	}

	public void setStoreCommercialCode(String storeCommercialCode) {
		this.storeCommercialCode = storeCommercialCode;
	}

	public String getStoreCompetitor() {
		return storeCompetitor;
	}

	public void setStoreCompetitor(String storeCompetitor) {
		this.storeCompetitor = storeCompetitor;
	}

	public String getStoreIDCard() {
		return storeIDCard;
	}

	public void setStoreIDCard(String storeIDCard) {
		this.storeIDCard = storeIDCard;
	}

	public String getStoreManName() {
		return storeManName;
	}

	public void setStoreManName(String storeManName) {
		this.storeManName = storeManName;
	}

	public String getStoreManTel() {
		return storeManTel;
	}

	public void setStoreManTel(String storeManTel) {
		this.storeManTel = storeManTel;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreOrgCode() {
		return storeOrgCode;
	}

	public void setStoreOrgCode(String storeOrgCode) {
		this.storeOrgCode = storeOrgCode;
	}

	public String getStoreRemarks() {
		return storeRemarks;
	}

	public void setStoreRemarks(String storeRemarks) {
		this.storeRemarks = storeRemarks;
	}

	public String getStoreResponsibleMan() {
		return storeResponsibleMan;
	}

	public void setStoreResponsibleMan(String storeResponsibleMan) {
		this.storeResponsibleMan = storeResponsibleMan;
	}

	public String getStoreResTel() {
		return storeResTel;
	}

	public void setStoreResTel(String storeResTel) {
		this.storeResTel = storeResTel;
	}

	public String getStoreSocietyCode() {
		return storeSocietyCode;
	}

	public void setStoreSocietyCode(String storeSocietyCode) {
		this.storeSocietyCode = storeSocietyCode;
	}

	public String getStoreTaxAccount() {
		return storeTaxAccount;
	}

	public void setStoreTaxAccount(String storeTaxAccount) {
		this.storeTaxAccount = storeTaxAccount;
	}

	public String getStoreShijiName() {
		return storeShijiName;
	}

	public void setStoreShijiName(String storeShijiName) {
		this.storeShijiName = storeShijiName;
	}

	public String getStoreShijiTel() {
		return storeShijiTel;
	}

	public void setStoreShijiTel(String storeShijiTel) {
		this.storeShijiTel = storeShijiTel;
	}


	@Override
	public String toString() {
		return "Store2 [id=" + id + ", storeApplyType=" + storeApplyType + ", storeCommercialCode="
				+ storeCommercialCode + ", storeCompetitor=" + storeCompetitor + ", storeIDCard=" + storeIDCard
				+ ", storeManName=" + storeManName + ", storeManTel=" + storeManTel + ", storeName=" + storeName
				+ ", storeOrgCode=" + storeOrgCode + ", storeRemarks=" + storeRemarks + ", storeResponsibleMan="
				+ storeResponsibleMan + ", storeResTel=" + storeResTel + ", storeSocietyCode=" + storeSocietyCode
				+ ", storeTaxAccount=" + storeTaxAccount + ", storeShijiName=" + storeShijiName + ", storeShijiTel="
				+ storeShijiTel + "]";
	}

	

}