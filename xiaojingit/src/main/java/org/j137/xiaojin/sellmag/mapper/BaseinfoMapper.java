package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Baseinfo;

/**
 * ������Ϣӳ���
 * @author Administrator
 *
 */
public interface BaseinfoMapper {
	/**
	 * ���������Ϣ
	 * @param info ������Ϣ����
	 * @return
	 */
	@Insert(value="insert into t_baseinfo(name,sex,cardtype,cardnumber,validate,credentials,"
			+ "census,nation,telphone,tel_use_date,tel_fare,isregister,"
			+ "qq,wechat,addr_tel,tel_name) values (#{info.name},#{info.sex},#{info.cardtype},#{info.cardnumber},#{info.validate},"
			+ "#{info.credentials},#{info.census},#{info.nation},#{info.telphone},#{info.telUseDate},#{info.telFare},#{info.isregister},#{info.qq},"
			+ "#{info.wechat},#{info.addrTel},#{info.telName})")
	@Options(useGeneratedKeys=true,keyProperty="info.id")
	public int saveBaseinfo(@Param("info")Baseinfo info);

	/**
	 * ����ID��ѯ������Ϣ
	 * @param id
	 * @return
	 */
	@ResultType(Baseinfo.class)
	@Select("select name,sex,cardtype,cardnumber,validate,credentials,"
			+ "census,nation,telphone,tel_use_date as telUseDate,tel_fare "
			+ "as telFare,isregister,"
			+ "qq,wechat,addr_tel as addrTel,tel_name as telName from t_baseinfo where id = #{id}")
	public Baseinfo findBaseinfo(long id);
}
