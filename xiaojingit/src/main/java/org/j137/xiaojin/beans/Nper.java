package org.j137.xiaojin.beans;


/**
 * ����
 * @author Administrator
 * @version 1.0
 * @created 13-7��-2017 11:39:39
 */
public class Nper {
//	/**����*/
	private String guarantee;
	/*����id*/
	private long id;
	/*�±�����������*/
	private String insuranceRate;
	/*�ݼ���*/
	private String lapseRate;
	/*��С������*/
	private String lminoan;
	/*��������*/
	private String maxnoan;
	/*����*/
	private String nper;
	/*ƽ̨��������*/
	private String platformRate;
	//	��Ʒ����
	private Product productCode;
	/*�˿���*/
	private String refundRate;
	/*�������*/
	private String serviceRate;

	public Nper(){

	}

	@Override
	public String toString() {
		return "Nper [guarantee=" + guarantee + ", id=" + id + ", insuranceRate=" + insuranceRate + ", lapseRate="
				+ lapseRate + ", lminoan=" + lminoan + ", maxnoan=" + maxnoan + ", nper=" + nper + ", platformRate="
				+ platformRate + ", refundRate=" + refundRate + ", serviceRate=" + serviceRate + "]";
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInsuranceRate() {
		return insuranceRate;
	}

	public void setInsuranceRate(String insuranceRate) {
		this.insuranceRate = insuranceRate;
	}

	public String getLapseRate() {
		return lapseRate;
	}

	public void setLapseRate(String lapseRate) {
		this.lapseRate = lapseRate;
	}

	public String getLminoan() {
		return lminoan;
	}

	public void setLminoan(String lminoan) {
		this.lminoan = lminoan;
	}

	public String getMaxnoan() {
		return maxnoan;
	}

	public void setMaxnoan(String maxnoan) {
		this.maxnoan = maxnoan;
	}

	public String getNper() {
		return nper;
	}

	public void setNper(String nper) {
		this.nper = nper;
	}

	public String getPlatformRate() {
		return platformRate;
	}

	public void setPlatformRate(String platformRate) {
		this.platformRate = platformRate;
	}

	public Product getProductCode() {
		return productCode;
	}

	public void setProductCode(Product productCode) {
		this.productCode = productCode;
	}

	public String getRefundRate() {
		return refundRate;
	}

	public void setRefundRate(String refundRate) {
		this.refundRate = refundRate;
	}

	public String getServiceRate() {
		return serviceRate;
	}

	public void setServiceRate(String serviceRate) {
		this.serviceRate = serviceRate;
	}

	public Nper(String guarantee,  String insuranceRate,
			String lapseRate, String lminoan, String maxnoan, String nper,
			String platformRate, Product productCode, String refundRate,
			String serviceRate) {
		super();
		this.guarantee = guarantee;
		this.insuranceRate = insuranceRate;
		this.lapseRate = lapseRate;
		this.lminoan = lminoan;
		this.maxnoan = maxnoan;
		this.nper = nper;
		this.platformRate = platformRate;
		this.productCode = productCode;
		this.refundRate = refundRate;
		this.serviceRate = serviceRate;
	}

	

}