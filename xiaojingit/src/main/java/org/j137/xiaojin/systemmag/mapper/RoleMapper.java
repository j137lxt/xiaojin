package org.j137.xiaojin.systemmag.mapper;

import java.util.Map;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Role;

public interface RoleMapper {
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
	public Page findRole(Map map);
	/**
	 *查询总条目 
	 */
	public int findRoleNum();
}
