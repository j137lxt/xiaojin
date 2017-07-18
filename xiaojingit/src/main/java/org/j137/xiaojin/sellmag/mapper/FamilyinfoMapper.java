package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Familyinfo;
/**
 * ��ͥ��Ϣӳ���ӿ�
 * @author Administrator
 *
 */
public interface FamilyinfoMapper {
	/**
	 * �����ͥ��Ϣ
	 * @param family ��ͥ��Ϣ����
	 * @return
	 */
	@Insert("insert into t_familyinfo(marrystate,spousename,spousetelphone,familyname"
			+ ",relationship,telphone,iscensus,familyaddress,isfamilyknow) values(#{family.marrystate},"
			+ "#{family.spousename},#{family.spousetelphone},#{family.familyname},#{family.relationship},#{family.telphone},#{family.iscensus},"
			+ "#{family.familyaddress},#{family.isfamilyknow})")
	@Options(useGeneratedKeys=true,keyProperty="family.id")
	public int saveFamilyinfo(@Param("family")Familyinfo family);
	
	/**
	 * ��ѯ��ͥ��Ϣ
	 * @param id
	 * @return
	 */
	@ResultType(Familyinfo.class)
	@Select("select * from t_familyinfo")
	public Familyinfo findFamilyinfo(long id);
}
