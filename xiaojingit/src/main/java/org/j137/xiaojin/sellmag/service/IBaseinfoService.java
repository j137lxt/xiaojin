package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Baseinfo;
/**
 * ������Ϣҵ���ӿ�
 * @author Administrator
 *
 */
public interface IBaseinfoService {
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
