package org.j137.xiaojin.marketmag.dao;

import java.util.List;
import java.util.Map;

import org.j137.xiaojin.beans.Store;

public interface IStoreDao {
	public void addStoreInfo(Store store);
	public Store findStoreInfo(Long id);
	public void updateStoreInfo(Store store);
	/**
	 * 统计有多少条记录符合查询条件
	 * @param map
	 * @return
	 */
	public int countStoreListByMapToPager(Map map);
	/**
	 * 取出具体需要显示商户的数据
	 * @param map
	 * @return
	 */
	public List<?> findStoreListByMapToPager(Map map);
}
