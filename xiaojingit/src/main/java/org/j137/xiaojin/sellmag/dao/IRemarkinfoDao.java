package org.j137.xiaojin.sellmag.dao;

import org.j137.xiaojin.beans.Remarkinfo;

/**
 * 备注信息持久层
 * @author Administrator
 *
 */
public interface IRemarkinfoDao {
	/**
	 * 新增备注信息
	 * @param remark
	 * @return
	 */
	public int saveRemarkinfo(Remarkinfo remark);
	
	/**
	 * 根据ID查询备注信息
	 * @param id
	 * @return
	 */
	public Remarkinfo findRemarkinfo(long id);
}
