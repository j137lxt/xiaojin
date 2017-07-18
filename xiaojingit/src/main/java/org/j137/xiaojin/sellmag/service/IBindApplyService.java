package org.j137.xiaojin.sellmag.service;

import java.util.Map;

import org.j137.xiaojin.beans.Page;

/**
 * 销售员绑定申请业务层接口
 * @author Administrator
 *
 */
public interface IBindApplyService {
	/**
	 * 分页动态模糊查询
	 * @param curPage 当前页
	 * @param pageSize 每页显示条数
	 * @param map 动态模糊查询条件
	 * @return
	 */
	public Page findByPage(Map map,Page page);
} 
