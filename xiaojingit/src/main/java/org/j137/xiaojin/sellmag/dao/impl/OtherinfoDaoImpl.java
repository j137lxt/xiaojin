package org.j137.xiaojin.sellmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Concaterinfo;
import org.j137.xiaojin.beans.Otherinfo;
import org.j137.xiaojin.sellmag.dao.IOtherinfoDao;
import org.j137.xiaojin.sellmag.mapper.OtherinfoMapper;
import org.springframework.stereotype.Repository;
@Repository
public class OtherinfoDaoImpl implements IOtherinfoDao {
	@Resource
	private OtherinfoMapper om;
	
	public int saveOtherinfo(Otherinfo other) {
		// TODO Auto-generated method stub
		return om.saveOtherinfo(other);
	}

	public int saveConcaterinfo(Concaterinfo concate) {
		// TODO Auto-generated method stub
		return om.saveConcaterinfo(concate);
	}

	public int deleteOtherinfo(long id) {
		// TODO Auto-generated method stub
		return om.deleteOtherinfo(id);
	}

	public Concaterinfo findConcater(long id) {
		// TODO Auto-generated method stub
		return om.findConcater(id);
	}

	public Otherinfo findOtherinfo(long id) {
		// TODO Auto-generated method stub
		return om.findOtherinfo(id);
	}

}
