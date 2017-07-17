package org.j137.xiaojin.systemmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.j137.xiaojin.beans.Menu;

public interface MenuMapper {

	/**
	 * 保存菜单  1是在职，0是离职
	 * @param menu
	 */
	@Insert("insert into t_menu values(null,#{menu.menuName},#{menu.icon},#{menu.link},#{menu.authority},#{menu.origin},#{menu.sort},#{menu.state},#{menu.remark},1)")
	public void saveMenu(@Param("menu")Menu menu);
	/**
	 * 修改菜单 
	 * @param menu
	 */
	public void updateMenu(Menu menu);
	/**
	 * 逻辑删除菜单 
	 * @param menu
	 */
	@Update("update t_menu set exist=0 where id=#{id}")
	public void deleteMenu(Long id);
	/**
	 * 查询菜单 
	 * @param menu
	 */
	public List findMenu(Map map);
	/**
	 *查询总条目 
	 */
	@ResultType(Integer.class)
	@Select("select count(id) as num from t_menu where exist=1")
	public int findMenuNum();
}
