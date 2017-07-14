package org.j137.xiaojin.systemmag.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Role;
import org.j137.xiaojin.systemmag.dao.IRoleDao;
import org.j137.xiaojin.systemmag.service.IRoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService{

	@Resource
	private IRoleDao roleDaoImpl;
	@Override
	public void saveRole(Role role) {
		// TODO Auto-generated method stub
		roleDaoImpl.saveRole(role);
	}

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		roleDaoImpl.updateRole(role);
	}

	@Override
	public void deleteRole(Long id) {
		// TODO Auto-generated method stub
		roleDaoImpl.deleteRole(id);
	}

	@Override
	public Page findRole(Page page) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("page", page);
		return roleDaoImpl.findRole(map);
	}

	@Override
	public Page findRoleByItems(Map map) {
		// TODO Auto-generated method stub
		return roleDaoImpl.findRole(map);
	}

}
