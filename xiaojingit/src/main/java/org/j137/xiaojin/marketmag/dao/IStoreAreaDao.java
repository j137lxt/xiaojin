package org.j137.xiaojin.marketmag.dao;

import org.j137.xiaojin.beans.StoreArea;

public interface IStoreAreaDao {
	public void addStoreAreainfo(StoreArea storeArea);
	public void findStoreAreaInfo(long id);
	public void updateStoreAreaInfo(StoreArea storeArea);
}
