package org.j137.xiaojin.sellmag.dao;

import org.j137.xiaojin.beans.Baseinfo;

/**
 * 基本信息持久层
 * @author Administrator
 *
 */
public interface IBaseinfoDao {
	/**
	 * 保存基本信息
	 * @param info 基本信息对象
	 * @return
	 */
	public int saveBaseinfo(Baseinfo info);

	/**
	 * 根据ID查询基本信息
	 * @param id
	 * @return
	 */
	public Baseinfo findBaseinfo(long id);
}
