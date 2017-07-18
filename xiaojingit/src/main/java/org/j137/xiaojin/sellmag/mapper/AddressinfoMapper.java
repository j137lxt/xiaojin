package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Addressinfo;
import org.j137.xiaojin.beans.Baseinfo;
/**
 * ��������סӳ���ӿ�
 * @author Administrator
 *
 */
public interface AddressinfoMapper {
	/**
	 * �����ַ��Ϣ
	 * @param address ��ַ��Ϣ����
	 * @return
	 */
	@Insert(value="insert into t_addressinfo(address,iscensus,address_now,address_time,"
			+ "house,month_ticket) values(#{address.address},#{address.iscensus},"
			+ "#{address.addressNow},#{address.addressTime},#{address.house},#{address.monthTicket})")
	@Options(useGeneratedKeys=true,keyProperty="address.id")
	public int saveAddressinfo(@Param("address")Addressinfo address);
	
	/**
	 * �����û�ID��ѯ��������ס��Ϣ
	 * @param id
	 * @return
	 */
	@ResultType(Addressinfo.class)
	@Select("select address,iscensus,address_now as addressNow,address_time as addressTime,house,month_ticket as monthTicket"
			+ " from t_addressinfo where id=#{id}")
	public Addressinfo findAddressinfo(long id);
}
