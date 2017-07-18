package org.j137.xiaojin.sellmag.dao;

import java.util.List;
import java.util.Map;

/**
 * 销售员绑定申请持久层接口
 * @author Administrator
 *
 */
public interface IBindApplyDao {
	/**
	 * 统计有多少条记录符合查询条件
	 * @param map
	 * @return
	 */
	public int countSaleManListByMapToPager(Map map);
	/**
	 * 取出具体需要显示给用户的数据
	 * @param map
	 * @return
	 */
	public List<?> findSaleManListByMapToPager(Map map);
} 
