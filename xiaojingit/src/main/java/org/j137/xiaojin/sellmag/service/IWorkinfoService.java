package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Workinfo;

public interface IWorkinfoService {
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
//	/**
//	 * 修改工作信息
//	 * @param work 工作信息对象
//	 * @param id
//	 * @return
//	 */
//	public int updateWorkinfo(Workinfo work,long id);
}
