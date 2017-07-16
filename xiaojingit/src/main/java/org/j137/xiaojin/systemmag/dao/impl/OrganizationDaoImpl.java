package org.j137.xiaojin.systemmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Organization;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.systemmag.dao.IOrganizationDao;
import org.j137.xiaojin.systemmag.mapper.OrganizationMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationDaoImpl implements IOrganizationDao {

	@Resource
	private OrganizationMapper om;
	@Override
	public void saveOrg(Organization org) {
		om.saveOrg(org);
	}

	@Override
	public void updateOrg(Organization org) {
		om.updateOrg(org);
	}

	@Override
	public void deleteOrg(Long id) {
		om.deleteOrg(id);
	}

	@Override
	public Page findAllOrg(Page page) {
		// TODO Auto-generated method stub
		return om.findAllOrg(page);
	}

	@Override
	public int findOrganizationNum() {
		// TODO Auto-generated method stub
		return om.findOrganizationNum();
	}

}
