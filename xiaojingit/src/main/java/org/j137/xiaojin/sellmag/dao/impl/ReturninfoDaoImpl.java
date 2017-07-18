package org.j137.xiaojin.sellmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Returninfo;
import org.j137.xiaojin.sellmag.dao.IReturninfoDao;
import org.j137.xiaojin.sellmag.mapper.ReturninfoMapper;
import org.springframework.stereotype.Repository;
@Repository 
public class ReturninfoDaoImpl implements IReturninfoDao {
	@Resource
	private ReturninfoMapper rm;
	
	public int saveReturninfo(Returninfo returninfo) {
		// TODO Auto-generated method stub
		return rm.saveReturninfo(returninfo);
	}

	public Returninfo findReturninfo(long id) {
		// TODO Auto-generated method stub
		return rm.findReturninfo(id);
	}

}
