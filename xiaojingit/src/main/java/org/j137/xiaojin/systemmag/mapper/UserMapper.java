package org.j137.xiaojin.systemmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.User;

public interface UserMapper {
	/**
	 * 保存用户
	 * @param user
	 */
	@Insert("insert into t_user values(null,#{user.organization.id},#{user.userCode},#{user.loginName},#{user.relname},#{user.phone},#{user.idCard},#{user.email},#{user.state},1)")
		public void saveUser(@Param("user")User user);
		/**
		 * 修改用户
		 * @param user
		 */
		public void updateUser(User user);
		/**
		 * 逻辑删除用户
		 * @param user
		 */
		@Update("update t_user set exist=0 where id=#{id}")
		public void deleteUser(Long id);
		/**
		 * 查询在职用户
		 * @param user
		 */
		public List findAllUser(Map map);
		/**
		 *查询总条目 
		 */
		@ResultType(Integer.class)
		@Select("select count(id) as num from t_user where exist=1")
		public int findUserNum();
}
