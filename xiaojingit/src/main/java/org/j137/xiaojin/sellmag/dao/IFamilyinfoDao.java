package org.j137.xiaojin.sellmag.dao;

import org.j137.xiaojin.beans.Familyinfo;
/**
 * ��ͥ��Ϣҵ���ӿ�
 * @author Administrator
 *
 */
public interface IFamilyinfoDao {
	/**
	 * �����ͥ��Ϣ
	 * @param family ��ͥ��Ϣ����
	 * @return
	 */
	public int saveFamilyinfo(Familyinfo family);
	
	/**
	 * ��ѯ��ͥ��Ϣ
	 * @param id
	 * @return
	 */
	public Familyinfo findFamilyinfo(long id);
}
