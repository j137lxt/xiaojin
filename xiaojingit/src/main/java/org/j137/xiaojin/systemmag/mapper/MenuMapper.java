package org.j137.xiaojin.systemmag.mapper;

import java.util.Map;

import org.j137.xiaojin.beans.Menu;
import org.j137.xiaojin.beans.Page;

public interface MenuMapper {

	/**
	 * 保存菜单 
	 * @param menu
	 */
	public void saveMenu(Menu menu);
	/**
	 * 修改菜单 
	 * @param menu
	 */
	public void updateMenu(Menu menu);
	/**
	 * 逻辑删除菜单 
	 * @param menu
	 */
	public void deleteMenu(Long id);
	/**
	 * 查询菜单 
	 * @param menu
	 */
	public Page findMenu(Map map);
}
