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
 * @created 13-7月-2017 11:39:39
 */
public interface OrganizationMapper {
	/**
	 * 新增一个机构
	 * @param org
	 */
	@Insert("insert into t_organization values(null,#{orgName},#{orgCode},#{grandOrg},#{sort},#{state},#{remark},1)")
	public void saveOrg(Organization org);
	
	/**
	 * 修改机构的属性
	 * @param org
	 */
	public void updateOrg(Organization org);
	
	/**
	 * 逻辑删除一个机构
	 * @param id
	 */
	@Update("update t_organization set exist=0 where id=#{id}")
	public void deleteOrg(Long id);
	
	/**
	 * 查询所有未删除的机构
	 * @param page
	 * @return
	 */
	@ResultType(java.util.List.class)
	@Select("select id as id,org_name as orgName,org_code as orgCode,grand_org as grandOrg,sort as sort,state as state,remark as remark,exist as exist from t_organization where exist=1")
	public List<Organization> findAllOrg(Page page);
	
	/**
	 *查询总条目 
	 */
	@ResultType(Integer.class)
	@Select("select count(id) as num from t_organization where exist=1")
	public int findOrganizationNum();
	
	@ResultType(Organization.class)
	@Select("select id as id,org_name as orgName,org_code as orgCode,grand_org as grandOrg,sort as sort,state as state,remark as remark,exist as exist from t_organization where exist=1 and id=#{id}")
	public Organization findOrgById(Long id);
}