package org.j137.xiaojin.beans;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 产品门店绑定信息
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 14:01:09
 */
public class Product_macket {

	private Date begin_time;
	private Date end_time;
	private Long fk_macket;
	private Long fk_product;
	private Long id;
	private BigDecimal maxmoney;

	public Product_macket(){

	}

	public void finalize() throws Throwable {

	}

}