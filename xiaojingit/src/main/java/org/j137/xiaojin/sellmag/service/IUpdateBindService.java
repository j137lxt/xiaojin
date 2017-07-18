package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Salesman;

/**
 * 绑定申请修改和详细信息
 * @author Administrator
 *
 */
public interface IUpdateBindService {
	/**
	 * 根据ID查询销售员
	 * @param id
	 * @return
	 */
	public Salesman findSalesmanById(long id);
	/**
	 * 根据ID修改销售员
	 * @param sale
	 * @param id
	 * @return
	 */
	public Salesman updateSalesman(Salesman sale,long id);
}
