package org.j137.xiaojin.basemag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.catalina.Store;
import org.j137.xiaojin.basemag.dao.ISalesmanDao;
import org.j137.xiaojin.basemag.service.ISalesmanService;
import org.j137.xiaojin.beans.PageBean;
import org.j137.xiaojin.beans.Salesman;
import org.springframework.stereotype.Service;

@Service
public class SalesmanServiceImpl implements ISalesmanService{

	@Resource
	private ISalesmanDao salesmanDaoImpl;
	
	@Override
	public List<Salesman> findAllSalesman(String buff,PageBean bean) {
		// TODO Auto-generated method stub
		return salesmanDaoImpl.findAllSalesman(buff,bean);
	}

	@Override
	public List<Salesman> findAllsalesmanBysaleidAndemployeesid(String saleid, String employeesid, String salestate,
			String employeesstate,PageBean bean) {
		// TODO Auto-generated method stub
		return salesmanDaoImpl.findAllsalesmanBysaleidAndemployeesid(saleid, employeesid, salestate, employeesstate, bean);
	}

	@Override
	public List<Store> findAllStore(PageBean bean) {
		// TODO Auto-generated method stub
		return salesmanDaoImpl.findAllStore(bean);
	}

	@Override
	public List<Salesman> findAllSaleManByNameandOrganizationId(String salename, Long OrganizationId,PageBean bean) {
		// TODO Auto-generated method stub
		return salesmanDaoImpl.findAllSaleManByNameandOrganizationId(salename, OrganizationId,bean);
	}

	@Override
	public Salesman findSalemanById(Long id) {
		// TODO Auto-generated method stub
		return salesmanDaoImpl.findSalemanById(id);
	}

	@Override
	public long getAllUserCount() {
		// TODO Auto-generated method stub
		return salesmanDaoImpl.getAllUserCount();
	}

}
