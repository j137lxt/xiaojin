package org.j137.xiaojin.sellmag.dao;

import org.j137.xiaojin.beans.Baseinfo;

/**
 * ������Ϣ�־ò�
 * @author Administrator
 *
 */
public interface IBaseinfoDao {
	/**
	 * ���������Ϣ
	 * @param info ������Ϣ����
	 * @return
	 */
	public int saveBaseinfo(Baseinfo info);

	/**
	 * ����ID��ѯ������Ϣ
	 * @param id
	 * @return
	 */
	public Baseinfo findBaseinfo(long id);
}
