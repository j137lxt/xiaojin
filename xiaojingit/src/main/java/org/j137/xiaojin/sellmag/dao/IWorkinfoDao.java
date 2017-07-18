package org.j137.xiaojin.sellmag.dao;

import org.j137.xiaojin.beans.Workinfo;

public interface IWorkinfoDao {
	/**
	 * 保存工作信息
	 * @param work 工作信息对象
	 * @return
	 */
	public int saveWorkinfo(Workinfo work);
	
	/**
	 * 根据ID查询工作信息
	 * @param id
	 * @return
	 */
	public Workinfo findWorkinfo(long id);
}
