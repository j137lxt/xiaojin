package org.j137.xiaojin.sellmag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.sellmag.dao.IBindApplyDao;
import org.j137.xiaojin.sellmag.mapper.BindApplyMapper;
import org.springframework.stereotype.Repository;
@Repository
public class BindApplyDaoImpl implements IBindApplyDao {
	@Resource
	private BindApplyMapper bam;

	public int countSaleManListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return bam.countSaleManListByMapToPager(map);
	}

	public List<?> findSaleManListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return bam.findSaleManListByMapToPager(map);
	}
	


}
