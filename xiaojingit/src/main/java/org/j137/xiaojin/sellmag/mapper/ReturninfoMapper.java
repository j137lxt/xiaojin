package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Returninfo;

/**
 * 商品/贷款/还款信息
 * @author Administrator
 *
 */
public interface ReturninfoMapper {
	/**
	 * 新增商品/贷款/还款信息,联系人对象信息置空
	 * @param returninfo
	 * @return
	 */
	@Insert("insert into t_returninfo(shopbrand,shopmodel,price,payment,clientbank,clientaccount,fk_store_id,fk_stores_id) "
			+ " values(#{returninfo.shopbrand},#{returninfo.shopmodel},#{returninfo.price},#{returninfo.payment},#{returninfo.clientbank},"
			+ "#{returninfo.clientaccount},#{returninfo.store.id},#{returninfo.stores.id})")
	public int saveReturninfo(@Param("returninfo")Returninfo returninfo);
	
	/**
	 * 根据ID查询商品/贷款/还款信息
	 * @param id
	 * @return
	 */
	//连接商户，门店表查询，在配置文件里面去写
	public Returninfo findReturninfo(long id);
}
