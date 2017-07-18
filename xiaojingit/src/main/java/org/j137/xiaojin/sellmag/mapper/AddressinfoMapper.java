package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Addressinfo;
import org.j137.xiaojin.beans.Baseinfo;
/**
 * 户籍及居住映射层接口
 * @author Administrator
 *
 */
public interface AddressinfoMapper {
	/**
	 * 保存地址信息
	 * @param address 地址信息对象
	 * @return
	 */
	@Insert(value="insert into t_addressinfo(address,iscensus,address_now,address_time,"
			+ "house,month_ticket) values(#{address.address},#{address.iscensus},"
			+ "#{address.addressNow},#{address.addressTime},#{address.house},#{address.monthTicket})")
	@Options(useGeneratedKeys=true,keyProperty="address.id")
	public int saveAddressinfo(@Param("address")Addressinfo address);
	
	/**
	 * 根据用户ID查询户籍及居住信息
	 * @param id
	 * @return
	 */
	@ResultType(Addressinfo.class)
	@Select("select address,iscensus,address_now as addressNow,address_time as addressTime,house,month_ticket as monthTicket"
			+ " from t_addressinfo where id=#{id}")
	public Addressinfo findAddressinfo(long id);
}
