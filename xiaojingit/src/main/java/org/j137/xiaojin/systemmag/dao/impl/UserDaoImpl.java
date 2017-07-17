package org.j137.xiaojin.systemmag.dao.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.User;
import org.j137.xiaojin.systemmag.dao.IUserDao;
import org.j137.xiaojin.systemmag.mapper.UserMapper;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImpl implements IUserDao {

	@Resource
	private UserMapper um;
	@Override
	public void saveUser(User user) {
		um.saveUser(user);
	}

	@Override
	public void updateUser(User user) {
		um.updateUser(user);
	}

	@Override
	public void deleteUser(Long id) {
		um.deleteUser(id);
	}

	@Override
	public Page findAllUser(Map map) {
		// TODO Auto-generated method stub
		Page page = (Page) map.get("page");
		page.setData(um.findAllUser(map));
		return page;
	}

	@Override
	public int findUserNum() {
		// TODO Auto-generated method stub
		return um.findUserNum();
	}

}
