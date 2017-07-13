package org.j137.xiaojin.systemmag.service;

import org.j137.xiaojin.beans.Role;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 11:39:39
 */
public interface IRoleService {

	/**
	 * 添加一个角色
	 * @param role
	 */
	public void saveRole(Role role);
	
	/**
	 * 修改一个角色
	 * @param role
	 */
	public void updateRole(Role role);
	
	/**
	 * 逻辑删除一个角色
	 * @param id
	 */
	public void deleteRole(Long id);
}