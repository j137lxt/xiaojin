package org.j137.xiaojin.sellmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Returninfo;
import org.j137.xiaojin.sellmag.dao.ISellDao;
import org.j137.xiaojin.sellmag.mapper.SellMapper;
import org.springframework.stereotype.Repository;
@Repository
public class SellDaoImpl implements ISellDao {
	@Resource
	private SellMapper sm;
	
	public Returninfo findSellinfo(long id) {
		// TODO Auto-generated method stub
		return sm.findSellinfo(id);
	}

	public int updateSellinfo(Returninfo returninfo) {
		// TODO Auto-generated method stub
		return sm.updateSellinfo(returninfo);
	}

}
