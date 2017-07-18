package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Baseinfo;
/**
 * 基本信息业务层接口
 * @author Administrator
 *
 */
public interface IBaseinfoService {
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
