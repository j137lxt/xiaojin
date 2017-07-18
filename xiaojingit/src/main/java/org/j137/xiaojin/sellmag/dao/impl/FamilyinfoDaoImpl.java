package org.j137.xiaojin.sellmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Familyinfo;
import org.j137.xiaojin.sellmag.dao.IFamilyinfoDao;
import org.j137.xiaojin.sellmag.mapper.FamilyinfoMapper;
import org.springframework.stereotype.Repository;
@Repository
public class FamilyinfoDaoImpl implements IFamilyinfoDao {
	@Resource
	private FamilyinfoMapper fm;
	
	public int saveFamilyinfo(Familyinfo family) {
		// TODO Auto-generated method stub
		return fm.saveFamilyinfo(family);
	}

	public Familyinfo findFamilyinfo(long id) {
		// TODO Auto-generated method stub
		return fm.findFamilyinfo(id);
	}

}
