package org.j137.xiaojin.marketmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Store2;
import org.j137.xiaojin.marketmag.dao.IStore2Dao;
import org.j137.xiaojin.marketmag.mapper.Store2Mapper;
import org.springframework.stereotype.Repository;
@Repository
class Store2DaoImpl implements IStore2Dao {

	@Resource
	private Store2Mapper store2Mapper;
	@Override
	public void addStore2Info(Store2 store2) {
		store2Mapper.addStore2Info(store2);

	}

	@Override
	public void findStore2Info(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStore2Info(Store2 store2) {
		store2Mapper.updateStore2Info(store2);

	}

}
