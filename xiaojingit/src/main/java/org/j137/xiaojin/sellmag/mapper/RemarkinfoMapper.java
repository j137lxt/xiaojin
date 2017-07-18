package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Remarkinfo;

/**
 * 备注信息映射层
 * @author Administrator
 *
 */
public interface RemarkinfoMapper {
	/**
	 * 新增备注信息
	 * @param remark
	 * @return
	 */
	@Insert("insert into t_remarkinfo(sellremark) value(#{remark.sellremark})")
	public int saveRemarkinfo(@Param("remark")Remarkinfo remark);
	
	/**
	 * 根据ID查询备注信息
	 * @param id
	 * @return
	 */ 
	@ResultType(Remarkinfo.class)
	@Select("select * from t_remarkinfo")
	public Remarkinfo findRemarkinfo(long id);
}
