package org.j137.xiaojin.basemag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.j137.xiaojin.basemag.dao.IRebatesDao;
import org.j137.xiaojin.basemag.service.IRebatesService;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Rebates;
import org.springframework.stereotype.Service;
@Service
public class RebatesServiceImp implements IRebatesService {

	@Resource
	private IRebatesDao iRebatesDaoImp;
	
	@Override
	public int add(Rebates bean) {
		// TODO Auto-generated method stub
		return iRebatesDaoImp.add(bean);
	}

	@Override
	public List<Rebates> getlistpage(int id) {
		// TODO Auto-generated method stub
		return iRebatesDaoImp.getlistpage(id);
	}




}
