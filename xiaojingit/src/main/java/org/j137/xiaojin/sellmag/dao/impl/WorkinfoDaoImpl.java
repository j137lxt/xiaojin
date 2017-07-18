package org.j137.xiaojin.sellmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Workinfo;
import org.j137.xiaojin.sellmag.dao.IWorkinfoDao;
import org.j137.xiaojin.sellmag.mapper.WorkinfoMapper;
import org.springframework.stereotype.Repository;
@Repository
public class WorkinfoDaoImpl implements IWorkinfoDao {
	@Resource
	private WorkinfoMapper wm;
	public int saveWorkinfo(Workinfo work) {
		// TODO Auto-generated method stub
		return wm.saveWorkinfo(work);
	}

	public Workinfo findWorkinfo(long id) {
		// TODO Auto-generated method stub
		return wm.findWorkinfo(id);
	}

}
