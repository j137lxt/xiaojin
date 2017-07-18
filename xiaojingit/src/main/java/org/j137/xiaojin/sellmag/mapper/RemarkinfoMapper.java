package org.j137.xiaojin.sellmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Remarkinfo;

/**
 * ��ע��Ϣӳ���
 * @author Administrator
 *
 */
public interface RemarkinfoMapper {
	/**
	 * ������ע��Ϣ
	 * @param remark
	 * @return
	 */
	@Insert("insert into t_remarkinfo(sellremark) value(#{remark.sellremark})")
	public int saveRemarkinfo(@Param("remark")Remarkinfo remark);
	
	/**
	 * ����ID��ѯ��ע��Ϣ
	 * @param id
	 * @return
	 */ 
	@ResultType(Remarkinfo.class)
	@Select("select * from t_remarkinfo")
	public Remarkinfo findRemarkinfo(long id);
}
