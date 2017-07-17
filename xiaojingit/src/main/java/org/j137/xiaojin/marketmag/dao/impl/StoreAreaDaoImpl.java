package org.j137.xiaojin.marketmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.StoreArea;
import org.j137.xiaojin.marketmag.dao.IStoreAreaDao;
import org.j137.xiaojin.marketmag.mapper.StoreAreaMapper;
import org.springframework.stereotype.Repository;
@Repository
public class StoreAreaDaoImpl implements IStoreAreaDao {

	@Resource
	private StoreAreaMapper storeAreaMapper;
	@Override
	public void addStoreAreainfo(StoreArea storeArea) {
		System.out.println("====++======"+storeArea);
		storeAreaMapper.addStoreAreainfo(storeArea);
		
	}

	@Override
	public void findStoreAreaInfo(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStoreAreaInfo(StoreArea storeArea) {
		storeAreaMapper.updateStoreAreaInfo(storeArea);

	}

}
