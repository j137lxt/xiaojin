package org.j137.xiaojin.marketmag.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Store;
import org.j137.xiaojin.beans.Store2;
import org.j137.xiaojin.beans.StoreArea;
import org.j137.xiaojin.marketmag.dao.IStore2Dao;
import org.j137.xiaojin.marketmag.dao.IStoreAreaDao;
import org.j137.xiaojin.marketmag.dao.IStoreDao;
import org.j137.xiaojin.marketmag.service.IStoreService;
import org.springframework.stereotype.Service;
@Service
public class StoreServiceImpl implements IStoreService {
	@Resource
	private IStoreDao storeDaoImpl;
	@Resource
	private IStore2Dao store2DaoImpl;
	@Resource
	private IStoreAreaDao storeAreaDaoImpl;
	//private IBankStoreDao bankStoreDaoImpl;
	@Override
	public Page findStorePagePer(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPer(Map map) {
		Store s = (Store) map.get("111");
		storeDaoImpl.addStoreInfo(s);
		Store2 s2=(Store2) map.get("222");
		store2DaoImpl.addStore2Info(s2);
		StoreArea sa=(StoreArea) map.get("333");
		storeAreaDaoImpl.addStoreAreainfo(sa);
		/*Bank ba=(Bank) map.get("444");
		bankStoreDaoImpl.addBankInfo(ba);*/
	}
	@Override
	public Store findStorePerById(Long id) {
		//System.out.println("+++++++++++++++++"+id);
		return storeDaoImpl.findStoreInfo(id);
		
	}

	@Override
	public void updateStoreInfo(Long id,Map map) {
		//storeDaoImpl.findStoreInfo(id);

		Store s=(Store) map.get("11");
		storeDaoImpl.updateStoreInfo(s);
		Store2 s2=(Store2) map.get("22");
		store2DaoImpl.updateStore2Info(s2);
		StoreArea sa=(StoreArea) map.get("33");
		storeAreaDaoImpl.updateStoreAreaInfo(sa);

	}

}
