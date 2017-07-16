package org.j137.xiaojin.systemmag.dao;

import org.j137.xiaojin.beans.Organization;
import org.j137.xiaojin.beans.Page;

public interface IOrganizationDao {
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
	/**
	 *查询总条目 
	 */
	public int findOrganizationNum();
}
