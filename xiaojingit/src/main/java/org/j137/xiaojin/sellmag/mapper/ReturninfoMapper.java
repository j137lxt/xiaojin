package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Returninfo;

/**
 * ��Ʒ/����/������Ϣ
 * @author Administrator
 *
 */
public interface ReturninfoMapper {
	/**
	 * ������Ʒ/����/������Ϣ,��ϵ�˶�����Ϣ�ÿ�
	 * @param returninfo
	 * @return
	 */
	@Insert("insert into t_returninfo(shopbrand,shopmodel,price,payment,clientbank,clientaccount,fk_store_id,fk_stores_id) "
			+ " values(#{returninfo.shopbrand},#{returninfo.shopmodel},#{returninfo.price},#{returninfo.payment},#{returninfo.clientbank},"
			+ "#{returninfo.clientaccount},#{returninfo.store.id},#{returninfo.stores.id})")
	public int saveReturninfo(@Param("returninfo")Returninfo returninfo);
	
	/**
	 * ����ID��ѯ��Ʒ/����/������Ϣ
	 * @param id
	 * @return
	 */
	//�����̻����ŵ���ѯ���������ļ�����ȥд
	public Returninfo findReturninfo(long id);
}
