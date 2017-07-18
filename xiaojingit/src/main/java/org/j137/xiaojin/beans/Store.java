package org.j137.xiaojin.beans;

import java.util.Date;

/**
 * 商户
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 11:39:40
 */
public class Store {

	/**商户id*/
	private Long id;
	/**结算代码*/
	private String storeAccountCode;
	/**账户类型*/
	private String storeAccountType;
	/**申请时间*/
	private Date storeApplicationTime;
	/**保证金*/
	private String storeCautionMoney;
	/**商户代码*/
	private Long storeCode;
	/**初审处理人*/
	private String storeDealMan;
	/**电子邮箱*/
	private String storeEmail;
	/**商户名称*/
	private String storeName;
	/**是否预审*/
	private String storePerjuducation;
	/**审批时间*/
	private Date storeProessingTime;
	/**原因备注*/
	private String storeReasonMark;
	/**特殊申请原因*/
	private String storeSpecialReason;
	/**状态*/
	private String storeStutis;
	/**商户类别*/
	private String storeType;
	/**申请变更原因*/
	private String storeUpdateReason;
	/**修改类型*/
	private String storeUpdateType;
	/**退货是否允许扣款*/
	private String storeWithhold;
	/**激活时间*/
	private Date stroeActiveTime;
	/**商户地址*/
	private String stroeAddress;
	/**签约时间*/
	private Date stroeContractTime;
	/**专案商户类型*/
	private String stroeSpecialType;
	/**渠道*/
	private String stroeWay;

	/**商户附属实体*/
	private Store2 store2;
	/**商户地区实体*/
	private StoreArea storeArea;
	/**门店实体*/
	private Stores stores;
	

	public void finalize() throws Throwable {
}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStoreAccountCode() {
		return storeAccountCode;
	}

	public void setStoreAccountCode(String storeAccountCode) {
		this.storeAccountCode = storeAccountCode;
	}

	public String getStoreAccountType() {
		return storeAccountType;
	}

	public void setStoreAccountType(String storeAccountType) {
		this.storeAccountType = storeAccountType;
	}

	public Date getStoreApplicationTime() {
		return storeApplicationTime;
	}

	public void setStoreApplicationTime(Date storeApplicationTime) {
		this.storeApplicationTime = storeApplicationTime;
	}

	public String getStoreCautionMoney() {
		return storeCautionMoney;
	}

	public void setStoreCautionMoney(String storeCautionMoney) {
		this.storeCautionMoney = storeCautionMoney;
	}

	public Long getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(Long storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreDealMan() {
		return storeDealMan;
	}

	public void setStoreDealMan(String storeDealMan) {
		this.storeDealMan = storeDealMan;
	}

	public String getStoreEmail() {
		return storeEmail;
	}

	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStorePerjuducation() {
		return storePerjuducation;
	}

	public void setStorePerjuducation(String storePerjuducation) {
		this.storePerjuducation = storePerjuducation;
	}

	public Date getStoreProessingTime() {
		return storeProessingTime;
	}

	public void setStoreProessingTime(Date storeProessingTime) {
		this.storeProessingTime = storeProessingTime;
	}

	public String getStoreReasonMark() {
		return storeReasonMark;
	}

	public void setStoreReasonMark(String storeReasonMark) {
		this.storeReasonMark = storeReasonMark;
	}

	public String getStoreSpecialReason() {
		return storeSpecialReason;
	}

	public void setStoreSpecialReason(String storeSpecialReason) {
		this.storeSpecialReason = storeSpecialReason;
	}

	public String getStoreStutis() {
		return storeStutis;
	}

	public void setStoreStutis(String storeStutis) {
		this.storeStutis = storeStutis;
	}

	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public String getStoreUpdateReason() {
		return storeUpdateReason;
	}

	public void setStoreUpdateReason(String storeUpdateReason) {
		this.storeUpdateReason = storeUpdateReason;
	}

	public String getStoreUpdateType() {
		return storeUpdateType;
	}

	public void setStoreUpdateType(String storeUpdateType) {
		this.storeUpdateType = storeUpdateType;
	}

	public String getStoreWithhold() {
		return storeWithhold;
	}

	public void setStoreWithhold(String storeWithhold) {
		this.storeWithhold = storeWithhold;
	}

	public Date getStroeActiveTime() {
		return stroeActiveTime;
	}

	public void setStroeActiveTime(Date stroeActiveTime) {
		this.stroeActiveTime = stroeActiveTime;
	}

	public String getStroeAddress() {
		return stroeAddress;
	}

	public void setStroeAddress(String stroeAddress) {
		this.stroeAddress = stroeAddress;
	}

	public Date getStroeContractTime() {
		return stroeContractTime;
	}

	public void setStroeContractTime(Date stroeContractTime) {
		this.stroeContractTime = stroeContractTime;
	}

	public String getStroeSpecialType() {
		return stroeSpecialType;
	}

	public void setStroeSpecialType(String stroeSpecialType) {
		this.stroeSpecialType = stroeSpecialType;
	}

	public String getStroeWay() {
		return stroeWay;
	}

	public void setStroeWay(String stroeWay) {
		this.stroeWay = stroeWay;
	}

	public Store2 getStore2() {
		return store2;
	}

	public void setStore2(Store2 store2) {
		this.store2 = store2;
	}

	public StoreArea getStoreArea() {
		return storeArea;
	}

	public void setStoreArea(StoreArea storeArea) {
		this.storeArea = storeArea;
	}

	public Stores getStores() {
		return stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", storeAccountCode=" + storeAccountCode + ", storeAccountType=" + storeAccountType
				+ ", storeApplicationTime=" + storeApplicationTime + ", storeCautionMoney=" + storeCautionMoney
				+ ", storeCode=" + storeCode + ", storeDealMan=" + storeDealMan + ", storeEmail=" + storeEmail
				+ ", storeName=" + storeName + ", storePerjuducation=" + storePerjuducation + ", storeProessingTime="
				+ storeProessingTime + ", storeReasonMark=" + storeReasonMark + ", storeSpecialReason="
				+ storeSpecialReason + ", storeStutis=" + storeStutis + ", storeType=" + storeType
				+ ", storeUpdateReason=" + storeUpdateReason + ", storeUpdateType=" + storeUpdateType
				+ ", storeWithhold=" + storeWithhold + ", stroeActiveTime=" + stroeActiveTime + ", stroeAddress="
				+ stroeAddress + ", stroeContractTime=" + stroeContractTime + ", stroeSpecialType=" + stroeSpecialType
				+ ", stroeWay=" + stroeWay + ", store2=" + store2 + ", storeArea=" + storeArea + ", stores=" + stores
				+ "]";
	}

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Store(String storeAccountCode, String storeAccountType, Date storeApplicationTime,
			String storeCautionMoney, Long storeCode, String storeDealMan, String storeEmail, String storeName,
			String storePerjuducation, Date storeProessingTime, String storeReasonMark, String storeSpecialReason,
			String storeStutis, String storeType, String storeUpdateReason, String storeUpdateType,
			String storeWithhold, Date stroeActiveTime, String stroeAddress, Date stroeContractTime,
			String stroeSpecialType, String stroeWay) {
		super();
		this.storeAccountCode = storeAccountCode;
		this.storeAccountType = storeAccountType;
		this.storeApplicationTime = storeApplicationTime;
		this.storeCautionMoney = storeCautionMoney;
		this.storeCode = storeCode;
		this.storeDealMan = storeDealMan;
		this.storeEmail = storeEmail;
		this.storeName = storeName;
		this.storePerjuducation = storePerjuducation;
		this.storeProessingTime = storeProessingTime;
		this.storeReasonMark = storeReasonMark;
		this.storeSpecialReason = storeSpecialReason;
		this.storeStutis = storeStutis;
		this.storeType = storeType;
		this.storeUpdateReason = storeUpdateReason;
		this.storeUpdateType = storeUpdateType;
		this.storeWithhold = storeWithhold;
		this.stroeActiveTime = stroeActiveTime;
		this.stroeAddress = stroeAddress;
		this.stroeContractTime = stroeContractTime;
		this.stroeSpecialType = stroeSpecialType;
		this.stroeWay = stroeWay;
	}

	public Store(String storeAccountCode, String storeAccountType, Date storeApplicationTime,
			String storeCautionMoney, Long storeCode, String storeDealMan, String storeEmail, String storeName,
			String storePerjuducation, Date storeProessingTime, String storeReasonMark, String storeSpecialReason,
			String storeStutis, String storeType, String storeUpdateReason, String storeUpdateType,
			String storeWithhold, Date stroeActiveTime, String stroeAddress, Date stroeContractTime,
			String stroeSpecialType, String stroeWay, Store2 store2, StoreArea storeArea, Stores stores) {
		super();
		this.storeAccountCode = storeAccountCode;
		this.storeAccountType = storeAccountType;
		this.storeApplicationTime = storeApplicationTime;
		this.storeCautionMoney = storeCautionMoney;
		this.storeCode = storeCode;
		this.storeDealMan = storeDealMan;
		this.storeEmail = storeEmail;
		this.storeName = storeName;
		this.storePerjuducation = storePerjuducation;
		this.storeProessingTime = storeProessingTime;
		this.storeReasonMark = storeReasonMark;
		this.storeSpecialReason = storeSpecialReason;
		this.storeStutis = storeStutis;
		this.storeType = storeType;
		this.storeUpdateReason = storeUpdateReason;
		this.storeUpdateType = storeUpdateType;
		this.storeWithhold = storeWithhold;
		this.stroeActiveTime = stroeActiveTime;
		this.stroeAddress = stroeAddress;
		this.stroeContractTime = stroeContractTime;
		this.stroeSpecialType = stroeSpecialType;
		this.stroeWay = stroeWay;
		this.store2 = store2;
		this.storeArea = storeArea;
		this.stores = stores;
	}

	
	
	

}