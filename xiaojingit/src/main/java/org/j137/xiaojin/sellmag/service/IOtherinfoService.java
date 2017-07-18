package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Concaterinfo;
import org.j137.xiaojin.beans.Otherinfo;

public interface IOtherinfoService {
	/**
	 * 保存其他信息
	 * @param other 其他信息对象
	 * @return
	 */
	public int saveOtherinfo(Otherinfo other);
	
	/**
	 * 保存联系人
	 * @param concate 联系人对象
	 * @return
	 */
	public int saveConcaterinfo(Concaterinfo concate);
	
	/**
	 * 根据ID查看联系人和其他信息
	 * @param id
	 * @return
	 */
	public Concaterinfo findConcater(long id);
	
	/**
	 * 根据ID查看其他信息
	 * @param id
	 * @return
	 */
	public Otherinfo findOtherinfo(long id);
	
	
	/**
	 * 删除其他信息
	 * @param id
	 * @return
	 */
	public int deleteOtherinfo(long id);
}
