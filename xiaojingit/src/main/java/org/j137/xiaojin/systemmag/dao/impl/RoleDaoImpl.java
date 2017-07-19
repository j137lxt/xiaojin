package org.j137.xiaojin.systemmag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Role;
import org.j137.xiaojin.systemmag.dao.IRoleDao;
import org.j137.xiaojin.systemmag.mapper.RoleMapper;
import org.springframework.stereotype.Repository;
@Repository
public class RoleDaoImpl implements IRoleDao {

	@Resource
	private RoleMapper rm;
	@Override
	public void saveRole(Role role) {
		rm.saveRole(role);
	}

	@Override
	public void updateRole(Role role) {
		rm.updateRole(role);
	}

	@Override
	public void deleteRole(Long id) {
		rm.deleteRole(id);
	}

	@Override
	public Page findRole(Map map) {
		Page page = (Page) map.get("page");
		List list=rm.findRole(map);
		page.setData(list);
		return page;
	}

	@Override
	public int findRoleNum() {
		// TODO Auto-generated method stub
		return rm.findRoleNum();
	}

}
