package org.j137.xiaojin.sellmag.dao;

import org.j137.xiaojin.beans.Remarkinfo;

/**
 * ��ע��Ϣ�־ò�
 * @author Administrator
 *
 */
public interface IRemarkinfoDao {
	/**
	 * ������ע��Ϣ
	 * @param remark
	 * @return
	 */
	public int saveRemarkinfo(Remarkinfo remark);
	
	/**
	 * ����ID��ѯ��ע��Ϣ
	 * @param id
	 * @return
	 */
	public Remarkinfo findRemarkinfo(long id);
}
