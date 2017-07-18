package org.j137.xiaojin.basemag.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.j137.xiaojin.basemag.dao.IRebatesDao;
import org.j137.xiaojin.basemag.mapper.RebatesMapper;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Rebates;
import org.springframework.stereotype.Repository;
@Repository
public class IRebatesDaoImp implements IRebatesDao {

	@Resource
	private RebatesMapper mp;
	@Override
	public int add(Rebates bean) {
		// TODO Auto-generated method stub
		return mp.add(bean);
	}

	@Override
	public List<Rebates> getlistpage(int id) {
		// TODO Auto-generated method stub
		return mp.getlistpage(id);
	}


}
