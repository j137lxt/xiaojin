package org.j137.xiaojin.systemmag.service.impl;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Menu;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.systemmag.dao.IMenuDao;
import org.j137.xiaojin.systemmag.service.IMenuService;
import org.springframework.stereotype.Service;


/**
 * @author Administrator
 * @version 1.0
 * @created 13-7ÔÂ-2017 11:39:39
 */
@Service
public class MenuService implements IMenuService{
	@Resource
	private IMenuDao menuDaoImpl;
	
	
	public MenuService(){

	}

	public void finalize() throws Throwable {

	}

	@Override
	public void saveMenu(Menu menu) {
		menuDaoImpl.saveMenu(menu);
		
	}

	@Override
	public void updateMenu(Menu menu) {
		menuDaoImpl.updateMenu(menu);
		
	}

	@Override
	public void deleteMenu(Long id) {
		menuDaoImpl.deleteMenu(id);
		
	}

	@Override
	public Page findMenu(Page page) {
		Map map=new HashMap();
		map.put("page", page);
		return menuDaoImpl.findMenu(map);
	}

	@Override
	public Page findMenuByItem(Map map) {
		// TODO Auto-generated method stub
		return menuDaoImpl.findMenu(map);
	}


}