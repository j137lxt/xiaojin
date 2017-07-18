package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.j137.xiaojin.beans.Returninfo;

/**
 * ������Ϣӳ���
 * @author Administrator
 *
 */

public interface SellMapper {
	/**
	 * ����ID��ѯ������Ϣ
	 * @param id
	 * @return
	 */
	@Select("select id,salesname,salestelephone,activitycode from t_returninfo where id=#{id}")
	public Returninfo findSellinfo(long id);
	
	/**
	 * ����ID�޸�������Ϣ
	 * @param returninfo
	 * @param id
	 * @return
	 */
	@Update("update t_returninfo set salesname=#{returninfo.salesname},salestelephone="
			+ "#{returninfo.salestelephone},activitycode=#{returninfo.activitycode} where id=#{returninfo.id}")
	public int updateSellinfo(@Param("returninfo")Returninfo returninfo);
}
