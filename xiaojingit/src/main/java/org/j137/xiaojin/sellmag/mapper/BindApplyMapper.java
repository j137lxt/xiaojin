package org.j137.xiaojin.sellmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.j137.xiaojin.beans.Page;

/**
 * ����Ա������ӳ���ӿ�
 * @author Administrator
 *
 */
public interface BindApplyMapper {
	/**
	 * ͳ���ж�������¼���ϲ�ѯ����
	 * @param map
	 * @return
	 */
	public int countSaleManListByMapToPager(@Param("map")Map map);
	/**
	 * ȡ��������Ҫ��ʾ���û�������
	 * @param map
	 * @return
	 */
	public List<?> findSaleManListByMapToPager(@Param("map")Map map);
} 
