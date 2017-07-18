package org.j137.xiaojin.sellmag.dao;

import org.j137.xiaojin.beans.Returninfo;

/**
 * 商品/贷款/还款信息
 * @author Administrator
 *
 */
public interface IReturninfoDao {
	/**
	 * 新增商品/贷款/还款信息,联系人对象信息置空
	 * @param returninfo
	 * @return
	 */
	public int saveReturninfo(Returninfo returninfo);
	
	/**
	 * 根据ID查询商品/贷款/还款信息
	 * @param id
	 * @return
	 */
	public Returninfo findReturninfo(long id);
}
