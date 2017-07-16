package org.j137.xiaojin.basemag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.basemag.dao.INperDao;
import org.j137.xiaojin.basemag.mapper.NperMapper;
import org.j137.xiaojin.beans.Nper;
import org.springframework.stereotype.Repository;
@Repository
public class NperDaoImp implements INperDao {
	@Resource
	private NperMapper mp;
	@Override
	public int addNper(Nper bean) {
		System.out.println(bean);
		return mp.addNper(bean);
	}

	@Override
	public int updateNper(Nper bean) {
		// TODO Auto-generated method stub
		return mp.updateNper(bean);
	}

	@Override
	public Nper getByid(Long id) {
		// TODO Auto-generated method stub
		return mp.getByid(id);
	}

	@Override
	public List<Nper> getPridListNper(Long id) {
		// TODO Auto-generated method stub
		return mp.getPridListNper(id);
	}

}
