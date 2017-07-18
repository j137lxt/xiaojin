package org.j137.xiaojin.systemmag.mapper;

import java.util.List;

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
	@Insert("insert into t_organization values(null,#{orgName},#{orgCode},#{grandOrg},#{sort},#{state},#{remark},1)")
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
	@ResultType(java.util.List.class)
	@Select("select id as id,org_name as orgName,org_code as orgCode,grand_org as grandOrg,sort as sort,state as state,remark as remark,exist as exist from t_organization where exist=1")
	public List<Organization> findAllOrg(Page page);
	
	/**
	 *��ѯ����Ŀ 
	 */
	@ResultType(Integer.class)
	@Select("select count(id) as num from t_organization where exist=1")
	public int findOrganizationNum();
	
	@ResultType(Organization.class)
	@Select("select id as id,org_name as orgName,org_code as orgCode,grand_org as grandOrg,sort as sort,state as state,remark as remark,exist as exist from t_organization where exist=1 and id=#{id}")
	public Organization findOrgById(Long id);
}