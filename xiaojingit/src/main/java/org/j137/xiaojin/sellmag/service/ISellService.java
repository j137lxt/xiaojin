package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Returninfo;

/**
 * 销售信息业务层
 * @author Administrator
 *
 */
public interface ISellService {
	/**
	 * 根据ID查询销售信息
	 * @param id
	 * @return
	 */
	public Returninfo findSellinfo(long id);
	
	/**
	 * 根据ID修改销售信息
	 * @param returninfo
	 * @param id
	 * @return
	 */
	public int updateSellinfo(Returninfo returninfo);
}
