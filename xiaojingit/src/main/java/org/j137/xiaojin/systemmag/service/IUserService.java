package org.j137.xiaojin.systemmag.service;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.User;

import com.sun.javafx.collections.MappingChange.Map;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 11:39:39
 */
public interface IUserService {
	/**
	 * 保存用户
	 * 
	 * @param user
	 */
	public void saveUser(User user);

	/**
	 * 修改用户
	 * 
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * 逻辑删除用户
	 * 
	 * @param user
	 */
	public void deleteUser(Long id);

	/**
	 * 查询在职用户
	 * 
	 * @param user
	 */
	public Page findAllUser(Page page);

	/**
	 * 条件查询用户
	 * 
	 * @param map
	 * @return
	 */
	public Page findUserByItem(Map map);
}