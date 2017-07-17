package org.j137.xiaojin.marketmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Store;
import org.j137.xiaojin.marketmag.dao.IStoreDao;
import org.j137.xiaojin.marketmag.mapper.StoreMapper;
import org.springframework.stereotype.Repository;
@Repository
public class StoreDaoImpl implements IStoreDao {

	@Resource
	private StoreMapper storeMapper;
	@Override
	public void addStoreInfo(Store store) {
		storeMapper.addStoreInfo(store);

	}

	@Override
	public Store findStoreInfo(Long id) {
		System.out.println("=========================="+id);
		return storeMapper.findStoreInfo(id);
		
	}

	@Override
	public void updateStoreInfo(Store store) {
		storeMapper.updateStoreInfo(store);
		
	}

}
