package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Addressinfo;
/**
 * ��������סҵ���ӿ�
 * @author Administrator
 *
 */
public interface IAddressinfoService {
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
//	/**
//	 * 
//	 * @param address ��ַ��Ϣ����
//	 * @param id
//	 * @return
//	 */
//	public int updateAddressinfo(Addressinfo address,long id);
}
