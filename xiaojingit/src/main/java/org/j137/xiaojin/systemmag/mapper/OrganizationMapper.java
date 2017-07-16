package org.j137.xiaojin.systemmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.j137.xiaojin.beans.Organization;
import org.j137.xiaojin.beans.Page;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-7��-2017 11:39:39
 */
public interface OrganizationMapper {
	/**
	 * ����һ������
	 * @param org
	 */
	
	public void saveOrg(Organization org);
	
	/**
	 * �޸Ļ���������
	 * @param org
	 */
	public void updateOrg(Organization org);
	
	/**
	 * �߼�ɾ��һ������
	 * @param id
	 */
	@Update("update t_organization set exist=0 where id=#{id}")
	public void deleteOrg(Long id);
	
	/**
	 * ��ѯ����δɾ���Ļ���
	 * @param page
	 * @return
	 */
	public Page findAllOrg(Page page);
	
	/**
	 *��ѯ����Ŀ 
	 */
	@ResultType(Integer.class)
	@Select("select count(id) as num from t_organization")
	public int findOrganizationNum();
}