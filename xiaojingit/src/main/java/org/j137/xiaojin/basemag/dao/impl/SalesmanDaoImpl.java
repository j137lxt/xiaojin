package org.j137.xiaojin.basemag.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.catalina.Store;
import org.j137.xiaojin.basemag.dao.ISalesmanDao;
import org.j137.xiaojin.basemag.mapper.SalesmanMapper;
import org.j137.xiaojin.beans.PageBean;
import org.j137.xiaojin.beans.Salesman;
import org.springframework.stereotype.Repository;

@Repository
public class SalesmanDaoImpl implements ISalesmanDao{

	@Resource
	private SalesmanMapper sm;
	@Override
	public List<Salesman> findAllSalesman(String buff,PageBean bean) {
		// TODO Auto-generated method stub
		return sm.findAllSalesman(buff,bean);
	}

	@Override
	public List<Salesman> findAllsalesmanBysaleidAndemployeesid(String saleid, String employeesid, String salestate,
			String employeesstate,PageBean bean) {
		// TODO Auto-generated method stub
		return sm.findAllsalesmanBysaleidAndemployeesid(saleid, employeesid, salestate, employeesstate, bean);
	}

	@Override
	public List<Store> findAllStore(PageBean bean) {
		// TODO Auto-generated method stub
		return sm.findAllStore(bean);
	}

	@Override
	public List<Salesman> findAllSaleManByNameandOrganizationId(String salename, Long OrganizationId,PageBean bean) {
		// TODO Auto-generated method stub
		return sm.findAllSaleManByNameandOrganizationId(salename, OrganizationId,bean);
	}

	@Override
	public Salesman findSalemanById(Long id) {
		// TODO Auto-generated method stub
		return sm.findSalemanById(id);
	}

	@Override
	public long getAllUserCount() {
		// TODO Auto-generated method stub
		return sm.getAllUserCount();
	}

}
