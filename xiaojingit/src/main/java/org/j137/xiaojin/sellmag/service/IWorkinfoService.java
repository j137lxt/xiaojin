package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Workinfo;

public interface IWorkinfoService {
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
//	/**
//	 * �޸Ĺ�����Ϣ
//	 * @param work ������Ϣ����
//	 * @param id
//	 * @return
//	 */
//	public int updateWorkinfo(Workinfo work,long id);
}
