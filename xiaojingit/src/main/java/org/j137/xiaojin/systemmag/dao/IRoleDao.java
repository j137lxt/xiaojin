package org.j137.xiaojin.systemmag.dao;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Role;

public interface IRoleDao {
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
	/**
	 * 查询角色
	 * @param role
	 * @return
	 */
	public Page findRole(Page page);
}
