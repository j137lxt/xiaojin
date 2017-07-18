package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Baseinfo;

/**
 * 基本信息映射层
 * @author Administrator
 *
 */
public interface BaseinfoMapper {
	/**
	 * 保存基本信息
	 * @param info 基本信息对象
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
	 * 根据ID查询基本信息
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
