package org.j137.xiaojin.systemmag.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.User;
import org.j137.xiaojin.systemmag.dao.IUserDao;
import org.j137.xiaojin.systemmag.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

	@Resource
	private IUserDao userDaoImpl;
	@Override
	public void saveUser(User user) {
		userDaoImpl.saveUser(user);		
	}

	@Override
	public void updateUser(User user) {
		userDaoImpl.updateUser(user);		
	}

	@Override
	public void deleteUser(Long id) {
		userDaoImpl.deleteUser(id);		
	}

	@Override
	public Page findAllUser(Page page) {
		Map map=new HashMap();
		map.put("page", page);
		return userDaoImpl.findAllUser(map);
	}

	@Override
	public Page findUserByItem(Map map) {
		// TODO Auto-generated method stub
		return userDaoImpl.findAllUser(map);
	}

}
