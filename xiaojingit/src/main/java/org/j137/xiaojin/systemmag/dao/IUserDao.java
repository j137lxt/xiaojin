package org.j137.xiaojin.systemmag.dao;

import java.util.Map;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.User;

public interface IUserDao {
	/**
	 * 保存用户
	 * @param user
	 */
		public void saveUser(User user);
		/**
		 * 修改用户
		 * @param user
		 */
		public void updateUser(User user);
		/**
		 * 逻辑删除用户
		 * @param user
		 */
		public void deleteUser(Long id);
		/**
		 * 查询在职用户
		 * @param user
		 */
		public Page findAllUser(Map map);
		/**
		 *查询总条目 
		 */
		public int findUserNum();
}
