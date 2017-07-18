package org.j137.xiaojin.sellmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Remarkinfo;
import org.j137.xiaojin.sellmag.dao.IRemarkinfoDao;
import org.j137.xiaojin.sellmag.mapper.RemarkinfoMapper;
import org.springframework.stereotype.Repository;
@Repository
public class RemarkinfoDaoImpl implements IRemarkinfoDao {
	@Resource
	private RemarkinfoMapper rm;
	
	public int saveRemarkinfo(Remarkinfo remark) {
		// TODO Auto-generated method stub
		return rm.saveRemarkinfo(remark);
	}

	public Remarkinfo findRemarkinfo(long id) {
		// TODO Auto-generated method stub
		return rm.findRemarkinfo(id);
	}

}
