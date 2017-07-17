package org.j137.xiaojin.systemmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Role;

public interface RoleMapper {
	/**
	 * 添加一个角色
	 * @param role
	 */
	@Insert("insert into t_role values(null,#{role.roleName},#{role.roleCode},#{role.state},#{role.roleType},#{role.organization.id},1)")
	public void saveRole(@Param("role")Role role);
	
	/**
	 * 修改一个角色
	 * @param role
	 */
	public void updateRole(Role role);
	
	/**
	 * 逻辑删除一个角色
	 * @param id
	 */
	@Update("update t_role set exist=0 where id=#{id}")
	public void deleteRole(Long id);
	/**
	 * 查询角色
	 * @param role
	 * @return
	 */
	public List findRole(Map map);
	/**
	 *查询总条目 
	 */
	@ResultType(Integer.class)
	@Select("select count(id) as num from t_role where exist=1")
	public int findRoleNum();
}
