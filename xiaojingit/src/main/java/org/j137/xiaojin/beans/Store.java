package org.j137.xiaojin.beans;

import java.util.Date;
import java.util.List;

/**
 * �̻�
 * @author Administrator
 * @version 1.0
 * @updated 12-7��-2017 17:29:50
 */
public class Store {

	/**�̻�id*/
	private Long id;
	/**�������*/
	private String storeAccountCode;
	/**�˻�����*/
	private String storeAccountType;
	private Date storeApplicationTime;
	private String storeCautionMoney;
	/**�̻�����*/
	private Long storeCode;
	/**��������*/
	private String storeDealMan;
	/**��������*/
	private String storeEmail;
	/**�̻�����*/
	private String storeName;
	/**�Ƿ�Ԥ��*/
	private String storePerjuducation;
	private Date storeProessingTime;
	private String storeReasonMark;
	/**��������ԭ��*/
	private String storeSpecialReason;
	/**״̬*/
	private String storeStutis;
	/**�̻����*/
	private String storeType;
	/**������ԭ��*/
	private String storeUpdateReason;
	/**�޸�����*/
	private String storeUpdateType;
	/**�˻��Ƿ�����ۿ�*/
	private String storeWithhold;
	/**����ʱ��*/
	private Date stroeActiveTime;
	/**�̻���ַ*/
	private String stroeAddress;
	/**ǩԼʱ��*/
	private Date stroeContractTime;
	/**ר���̻�����*/
	private String stroeSpecialType;
	/**����*/
	private String stroeWay;

	/**�̻�����ʵ��*/
	private StoreArea storeArea;
	/**�ŵ�ʵ��*/
	private Stores stores;
	

	public void finalize() throws Throwable {
}

	private String storeLv;
    private List<Stores> list;//门店集合
    private Store2 store2;  //门店2对象


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
	public String getStoreLv() {
		return storeLv;
	}
	public void setStoreLv(String storeLv) {
		this.storeLv = storeLv;
	}
	public List<Stores> getList() {
		return list;
	}
	public void setList(List<Stores> list) {
		this.list = list;
	}
	public Store2 getStore2() {
		return store2;
	}
	public void setStore2(Store2 store2) {
		this.store2 = store2;
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
				+ ", stroeWay=" + stroeWay + ", storeArea=" + storeArea + ", stores=" + stores + ", storeLv=" + storeLv
				+ ", list=" + list + ", store2=" + store2 + "]";
	}
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}