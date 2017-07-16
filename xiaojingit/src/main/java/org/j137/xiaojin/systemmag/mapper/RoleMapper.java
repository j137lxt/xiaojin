package org.j137.xiaojin.systemmag.mapper;

import java.util.Map;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Role;

public interface RoleMapper {
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
	public Page findRole(Map map);
	/**
	 *��ѯ����Ŀ 
	 */
	public int findRoleNum();
}
