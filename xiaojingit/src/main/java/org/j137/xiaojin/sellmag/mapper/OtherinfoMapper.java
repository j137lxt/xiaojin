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
	 * ����������Ϣ
	 * @param other ������Ϣ����
	 * @return
	 */
	@Insert("insert into t_otherinfo values(#{other.id},#{other.monthincome},#{other.email},#{other.culture},"
			+ "#{other.ishandle},#{other.returnmoney})")
	@Options(useGeneratedKeys=true,keyProperty="other.id")
	public int saveOtherinfo(@Param("other")Otherinfo other);
	
	/**
	 * ������ϵ��
	 * @param concate ��ϵ�˶���
	 * @return
	 */
	@Insert("insert into t_concater values(#{concater.id},#{concater.name},#{concater.relationship},#{concater.telphone})")
	@Options(useGeneratedKeys=true,keyProperty="concater.id")
	public int saveConcaterinfo(@Param("concater")Concaterinfo concater);
	
	/**
	 * ����ID�鿴��ϵ����Ϣ
	 * @param id
	 * @return
	 */
	@ResultType(Concaterinfo.class)
	@Select("select * from t_concater where id=#{id}")
	public Concaterinfo findConcater(long id);
	
	/**
	 * ����ID�鿴������Ϣ
	 * @param id
	 * @return
	 */
	@ResultType(Otherinfo.class)
	@Select("select * from t_otherinfo where id=#{id}")
	public Otherinfo findOtherinfo(long id);
	
	/**
	 * ɾ��������Ϣ
	 * @param id
	 * @return
	 */
	@Delete("delete from t_concater where id=#{id}")
	public int deleteOtherinfo(long id);
}
