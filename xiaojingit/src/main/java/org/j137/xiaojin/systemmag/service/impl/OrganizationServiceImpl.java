package org.j137.xiaojin.systemmag.service.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Organization;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.systemmag.dao.IOrganizationDao;
import org.j137.xiaojin.systemmag.service.IOrganizationService;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements IOrganizationService {

	@Resource
	private IOrganizationDao organizationDaoImpl;
	@Override
	public void saveOrg(Organization org) {
		organizationDaoImpl.saveOrg(org);

	}

	@Override
	public void updateOrg(Organization org) {
		organizationDaoImpl.updateOrg(org);

	}

	@Override
	public void deleteOrg(Long id) {
		organizationDaoImpl.deleteOrg(id);

	}

	@Override
	public Page findAllOrg(Page page) {
		// TODO Auto-generated method stub
		return organizationDaoImpl.findAllOrg(page);
	}

}
