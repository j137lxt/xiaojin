package org.j137.xiaojin.systemmag.dao;

import org.j137.xiaojin.beans.Organization;
import org.j137.xiaojin.beans.Page;

public interface IOrganizationDao {
	/**
	 * ����һ������
	 * @param org
	 */
	public void saveOrg(Organization org);
	
	/**
	 * �޸Ļ���������
	 * @param org
	 */
	public void updateOrg(Organization org);
	
	/**
	 * �߼�ɾ��һ������
	 * @param id
	 */
	public void deleteOrg(Long id);
	
	/**
	 * ��ѯ����δɾ���Ļ���
	 * @param page
	 * @return
	 */
	public Page findAllOrg(Page page);
	/**
	 *��ѯ����Ŀ 
	 */
	public int findOrganizationNum();
}
