package org.j137.xiaojin.sellmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Baseinfo;
import org.j137.xiaojin.sellmag.dao.IBaseinfoDao;
import org.j137.xiaojin.sellmag.mapper.BaseinfoMapper;
import org.springframework.stereotype.Repository;

@Repository 
public class BaseinfoDaoImpl implements IBaseinfoDao {
	@Resource
	private BaseinfoMapper bp;
	
	public int saveBaseinfo(Baseinfo info) {
		// TODO Auto-generated method stub
		return bp.saveBaseinfo(info);
	}

	public Baseinfo findBaseinfo(long id) {
		// TODO Auto-generated method stub
		return bp.findBaseinfo(id);
	}

}
