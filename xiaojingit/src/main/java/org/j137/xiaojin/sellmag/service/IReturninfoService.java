package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Returninfo;

/**
 * ��Ʒ/����/������Ϣ
 * @author Administrator
 *
 */
public interface IReturninfoService {
	/**
	 * ������Ʒ/����/������Ϣ,��ϵ�˶�����Ϣ�ÿ�
	 * @param returninfo
	 * @return
	 */
	public int saveReturninfo(Returninfo returninfo);
	
	/**
	 * ����ID��ѯ��Ʒ/����/������Ϣ
	 * @param id
	 * @return
	 */
	public Returninfo findReturninfo(long id);
}
