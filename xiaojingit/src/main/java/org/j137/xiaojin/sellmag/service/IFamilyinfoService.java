package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Familyinfo;
/**
 * ��ͥ��Ϣҵ���ӿ�
 * @author Administrator
 *
 */
public interface IFamilyinfoService {
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
//	/**
//	 * �޸ļ�ͥ��Ϣ
//	 * @param family ��ͥ��Ϣ����
//	 * @param id
//	 * @return
//	 */
//	public int updateFamilyinfo(Familyinfo family,long id);
}
