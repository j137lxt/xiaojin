package org.j137.xiaojin.marketmag.dao;

import java.util.List;
import java.util.Map;

import org.j137.xiaojin.beans.Store;

public interface IStoreDao {
	public void addStoreInfo(Store store);
	public Store findStoreInfo(Long id);
	public void updateStoreInfo(Store store);
	/**
	 * ͳ���ж�������¼���ϲ�ѯ����
	 * @param map
	 * @return
	 */
	public int countStoreListByMapToPager(Map map);
	/**
	 * ȡ��������Ҫ��ʾ�̻�������
	 * @param map
	 * @return
	 */
	public List<?> findStoreListByMapToPager(Map map);
}
