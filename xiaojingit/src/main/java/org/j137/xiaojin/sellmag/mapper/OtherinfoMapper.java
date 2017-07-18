package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Addressinfo;
import org.j137.xiaojin.beans.Concaterinfo;
import org.j137.xiaojin.beans.Otherinfo;

public interface OtherinfoMapper {
	/**
	 * 保存其他信息
	 * @param other 其他信息对象
	 * @return
	 */
	@Insert("insert into t_otherinfo values(#{other.id},#{other.monthincome},#{other.email},#{other.culture},"
			+ "#{other.ishandle},#{other.returnmoney})")
	@Options(useGeneratedKeys=true,keyProperty="other.id")
	public int saveOtherinfo(@Param("other")Otherinfo other);
	
	/**
	 * 保存联系人
	 * @param concate 联系人对象
	 * @return
	 */
	@Insert("insert into t_concater values(#{concater.id},#{concater.name},#{concater.relationship},#{concater.telphone})")
	@Options(useGeneratedKeys=true,keyProperty="concater.id")
	public int saveConcaterinfo(@Param("concater")Concaterinfo concater);
	
	/**
	 * 根据ID查看联系人信息
	 * @param id
	 * @return
	 */
	@ResultType(Concaterinfo.class)
	@Select("select * from t_concater where id=#{id}")
	public Concaterinfo findConcater(long id);
	
	/**
	 * 根据ID查看其他信息
	 * @param id
	 * @return
	 */
	@ResultType(Otherinfo.class)
	@Select("select * from t_otherinfo where id=#{id}")
	public Otherinfo findOtherinfo(long id);
	
	/**
	 * 删除其他信息
	 * @param id
	 * @return
	 */
	@Delete("delete from t_concater where id=#{id}")
	public int deleteOtherinfo(long id);
}
