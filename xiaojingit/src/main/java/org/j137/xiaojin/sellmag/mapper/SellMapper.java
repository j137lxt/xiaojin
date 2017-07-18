package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.j137.xiaojin.beans.Returninfo;

/**
 * 销售信息映射层
 * @author Administrator
 *
 */

public interface SellMapper {
	/**
	 * 根据ID查询销售信息
	 * @param id
	 * @return
	 */
	@Select("select id,salesname,salestelephone,activitycode from t_returninfo where id=#{id}")
	public Returninfo findSellinfo(long id);
	
	/**
	 * 根据ID修改销售信息
	 * @param returninfo
	 * @param id
	 * @return
	 */
	@Update("update t_returninfo set salesname=#{returninfo.salesname},salestelephone="
			+ "#{returninfo.salestelephone},activitycode=#{returninfo.activitycode} where id=#{returninfo.id}")
	public int updateSellinfo(@Param("returninfo")Returninfo returninfo);
}
