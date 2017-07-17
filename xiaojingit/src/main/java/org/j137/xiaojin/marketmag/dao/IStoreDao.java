package org.j137.xiaojin.marketmag.dao;

import org.j137.xiaojin.beans.Store;

public interface IStoreDao {
	public void addStoreInfo(Store store);
	public Store findStoreInfo(Long id);
	public void updateStoreInfo(Store store);
	
}
