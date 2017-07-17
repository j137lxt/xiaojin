package org.j137.xiaojin.systemmag.service;

import java.util.Map;

import org.j137.xiaojin.beans.Menu;
import org.j137.xiaojin.beans.Page;


/**
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 11:39:39
 */
public interface IMenuService {
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
	public Page findMenu(Page page);
	/**
	 * 条件查询菜单
	 * @param map
	 * @return
	 */
	public Page findMenuByItem(Map map);
}