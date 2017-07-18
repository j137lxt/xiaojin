package org.j137.xiaojin.basemag.dao.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.j137.xiaojin.basemag.dao.IStoresDao;
import org.j137.xiaojin.basemag.mapper.StoresMapper;
import org.j137.xiaojin.beans.PageBean;
import org.j137.xiaojin.beans.Store;
import org.j137.xiaojin.beans.Stores;
import org.springframework.stereotype.Repository;


@Repository
public class StoresDaoImpl implements IStoresDao{

	@Resource
	private StoresMapper sm;
	
	@Override
	public List<Store> findAllStore(String buff,PageBean bean) {
		// TODO Auto-generated method stub
		return sm.findAllStore(buff,bean);
	}

	@Override
	public List<Store> mohuFindStore(String daima, String mingcheng, String buff, String fengxiandengji, String leixing,
			Date startime, Date endtime, Date shenpitime,
			Date endshenpitime, PageBean bean) {
		// TODO Auto-generated method stub
		return sm.mohuFindStore(daima, mingcheng, buff, fengxiandengji, leixing, startime, endtime, shenpitime, endshenpitime, bean);
	}

	@Override
	public List<Stores> findStoresBystoreId(Long id) {
		// TODO Auto-generated method stub
		return sm.findStoresBystoreId(id);
	}

	@Override
	public void addStores(Stores stores) {
		// TODO Auto-generated method stub
		stores.setState("激活");
		sm.addStores(stores);
	}

	@Override
	public void updateStores(Stores stores) {
		// TODO Auto-generated method stub
		sm.updateStores(stores);
	}

	@Override
	public PageBean findSalesmanByStoresId(Long id, String daima, String bianhao, String zhuangtai,
			String yaungongzhuangtai, int index) {
		// TODO Auto-generated method stub
		return sm.findSalesmanByStoresId(id, daima, bianhao, zhuangtai, yaungongzhuangtai, index);
	}

	@Override
	public List<Stores> findAllStores(Long id) {
		// TODO Auto-generated method stub
		return sm.findAllStores(id);
	}

	@Override
	public Store findStoreById(Long id) {
		// TODO Auto-generated method stub
		return sm.findStoreById(id);
	}

	@Override
	public void updateStoreById(Long id) {
		// TODO Auto-generated method stub
		sm.updateStoreById(id);
	}

}
