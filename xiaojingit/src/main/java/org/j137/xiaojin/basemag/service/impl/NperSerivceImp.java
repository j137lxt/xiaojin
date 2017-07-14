package org.j137.xiaojin.basemag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.basemag.dao.INperDao;
import org.j137.xiaojin.basemag.service.INperService;
import org.j137.xiaojin.beans.Nper;
import org.springframework.stereotype.Service;
@Service
public class NperSerivceImp implements INperService{
	
	@Resource
	private INperDao nperDaoImp;
	
	@Override
	public int addNper(Nper bean) {
		return nperDaoImp.addNper(bean);
	}

	@Override
	public int updateNper(Nper bean) {
		// TODO Auto-generated method stub
		return nperDaoImp.updateNper(bean);
	}

	@Override
	public Nper getByid(Long id) {
		// TODO Auto-generated method stub
		return nperDaoImp.getByid(id);
	}

	@Override
	public List<Nper> getPridListNper(Long id) {
		// TODO Auto-generated method stub
		return nperDaoImp.getPridListNper(id);
	}

}
