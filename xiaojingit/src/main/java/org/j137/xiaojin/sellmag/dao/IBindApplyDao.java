package org.j137.xiaojin.sellmag.dao;

import java.util.List;
import java.util.Map;

/**
 * ����Ա������־ò�ӿ�
 * @author Administrator
 *
 */
public interface IBindApplyDao {
	/**
	 * ͳ���ж�������¼���ϲ�ѯ����
	 * @param map
	 * @return
	 */
	public int countSaleManListByMapToPager(Map map);
	/**
	 * ȡ��������Ҫ��ʾ���û�������
	 * @param map
	 * @return
	 */
	public List<?> findSaleManListByMapToPager(Map map);
} 
