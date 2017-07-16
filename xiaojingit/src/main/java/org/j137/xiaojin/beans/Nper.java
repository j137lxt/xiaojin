package org.j137.xiaojin.beans;


/**
 * 期数
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 11:39:39
 */
public class Nper {
//	/**担保*/
	private String guarantee;
	/*期数id*/
	private long id;
	/*月保险手续费率*/
	private String insuranceRate;
	/*递减率*/
	private String lapseRate;
	/*最小贷款金额*/
	private String lminoan;
	/*最大贷款金额*/
	private String maxnoan;
	/*期数*/
	private String nper;
	/*平台手续费率*/
	private String platformRate;
	//	产品对象
	private Product productCode;
	/*退款率*/
	private String refundRate;
	/*服务费率*/
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