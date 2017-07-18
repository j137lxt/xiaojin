package org.j137.xiaojin.sellmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.j137.xiaojin.beans.Page;

/**
 * 销售员绑定申请映射层接口
 * @author Administrator
 *
 */
public interface BindApplyMapper {
	/**
	 * 统计有多少条记录符合查询条件
	 * @param map
	 * @return
	 */
	public int countSaleManListByMapToPager(@Param("map")Map map);
	/**
	 * 取出具体需要显示给用户的数据
	 * @param map
	 * @return
	 */
	public List<?> findSaleManListByMapToPager(@Param("map")Map map);
} 
