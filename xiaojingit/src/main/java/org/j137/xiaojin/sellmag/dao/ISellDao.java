package org.j137.xiaojin.sellmag.dao;

import org.j137.xiaojin.beans.Returninfo;

/**
 * ������Ϣ�־ò�
 * @author Administrator
 *
 */
public interface ISellDao {
	/**
	 * ����ID��ѯ������Ϣ
	 * @param id
	 * @return
	 */
	public Returninfo findSellinfo(long id);
	
	/**
	 * ����ID�޸�������Ϣ
	 * @param returninfo
	 * @param id
	 * @return
	 */
	public int updateSellinfo(Returninfo returninfo);
}
