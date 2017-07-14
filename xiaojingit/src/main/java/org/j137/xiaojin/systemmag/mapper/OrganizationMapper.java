package org.j137.xiaojin.systemmag.mapper;

import org.apache.ibatis.annotations.Insert;
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
	public void deleteOrg(Long id);
	
	/**
	 * 查询所有未删除的机构
	 * @param page
	 * @return
	 */
	public Page findAllOrg(Page page);
}