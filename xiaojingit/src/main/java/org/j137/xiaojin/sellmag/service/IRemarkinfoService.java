package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Remarkinfo;

/**
 * ��ע��Ϣҵ���
 * @author Administrator
 *
 */
public interface IRemarkinfoService {
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
