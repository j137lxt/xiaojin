package org.j137.xiaojin.sellmag.dao;

import org.j137.xiaojin.beans.Addressinfo;
/**
 * ��������ס�־ò�ӿ�
 * @author Administrator
 *
 */
public interface IAddressinfoDao {
	/**
	 * �����ַ��Ϣ
	 * @param address ��ַ��Ϣ����
	 * @return
	 */
	public int saveAddressinfo(Addressinfo address);
	
	/**
	 * �����û�ID��ѯ��������ס��Ϣ
	 * @param id
	 * @return
	 */
	public Addressinfo findAddressinfo(long id);
}
