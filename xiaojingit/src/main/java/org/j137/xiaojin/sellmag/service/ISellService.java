package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Returninfo;

/**
 * ������Ϣҵ���
 * @author Administrator
 *
 */
public interface ISellService {
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
