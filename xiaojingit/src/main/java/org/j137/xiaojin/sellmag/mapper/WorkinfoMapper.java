package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Workinfo;

public interface WorkinfoMapper {
	/**
	 * 保存工作信息
	 * @param work 工作信息对象
	 * @return
	 */
	@Insert("insert into t_workinfo values(#{work.id},#{work.clienttype},#{work.unitname},#{work.unittelphone},"
			+ "#{work.unitscale},#{work.unitquality},#{work.unittrade},#{work.partment},#{work.clientjob},"
			+ "#{work.unitdatetime},#{work.unittelname},#{work.unittelperson},#{work.unitpersonjob},#{work.unitaddress})")
	@Options(useGeneratedKeys=true,keyProperty="work.id")
	public int saveWorkinfo(@Param("work")Workinfo work);
	
	/**
	 * 根据ID查询工作信息
	 * @param id
	 * @return
	 */
	@ResultType(Workinfo.class)
	@Select("select * from t_workinfo")
	public Workinfo findWorkinfo(long id);
}
