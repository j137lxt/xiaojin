package org.j137.xiaojin.sellmag.dao;

import org.j137.xiaojin.beans.Workinfo;

public interface IWorkinfoDao {
	/**
	 * ���湤����Ϣ
	 * @param work ������Ϣ����
	 * @return
	 */
	public int saveWorkinfo(Workinfo work);
	
	/**
	 * ����ID��ѯ������Ϣ
	 * @param id
	 * @return
	 */
	public Workinfo findWorkinfo(long id);
}
