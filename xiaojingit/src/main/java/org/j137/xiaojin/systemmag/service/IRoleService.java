package org.j137.xiaojin.systemmag.service;

import java.util.Map;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Role;


/**
 * @author Administrator
 * @version 1.0
 * @created 13-7��-2017 11:39:39
 */
public interface IRoleService {

	/**
	 * ���һ����ɫ
	 * @param role
	 */
	public void saveRole(Role role);
	
	/**
	 * �޸�һ����ɫ
	 * @param role
	 */
	public void updateRole(Role role);
	
	/**
	 * �߼�ɾ��һ����ɫ
	 * @param id
	 */
	public void deleteRole(Long id);
	/**
	 * ��ѯ��ɫ
	 * @param role
	 * @return
	 */
	public Page findRole(Page page);
	/**
	 * ������ѯ��ɫ
	 * @param map
	 * @return
	 */
	public Page findRoleByItems(Map map);
}