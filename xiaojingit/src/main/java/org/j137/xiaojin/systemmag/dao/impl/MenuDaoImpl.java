package org.j137.xiaojin.systemmag.dao.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Menu;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.systemmag.dao.IMenuDao;
import org.j137.xiaojin.systemmag.mapper.MenuMapper;
import org.springframework.stereotype.Repository;
@Repository
public class MenuDaoImpl implements IMenuDao{

	@Resource
	private MenuMapper mm;

	@Override
	public void saveMenu(Menu menu) {
		mm.saveMenu(menu);
	}

	@Override
	public void updateMenu(Menu menu) {
		mm.updateMenu(menu);
		
	}

	@Override
	public void deleteMenu(Long id) {
		mm.deleteMenu(id);
	}

	@Override
	public Page findMenu(Map map) {
		// TODO Auto-generated method stub
		return mm.findMenu(map);
	}

	@Override
	public int findMenuNum() {
		// TODO Auto-generated method stub
		return mm.findMenuNum();
	}

}