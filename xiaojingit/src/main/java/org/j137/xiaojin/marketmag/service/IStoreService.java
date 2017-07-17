package org.j137.xiaojin.marketmag.service;

import java.util.Map;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Store;

public interface IStoreService {

	/**
	 * 商户分页展示
	 * @param map
	 * @param page
	 * @return
	 */
	public Page findStorePagePer(Map map);
	/**
	 * 添加商户
	 * @param map
	 */
	public void addPer(Map map);
	
	/**
	 * 查询商户信息
	 * @param id
	 * @return 
	 */
	public Store findStorePerById(Long id);
	/**
	 * 根据id修改商户
	 * @param id
	 */
	public void updateStoreInfo(Long id,Map map);
}
