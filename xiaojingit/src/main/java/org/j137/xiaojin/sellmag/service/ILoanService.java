package org.j137.xiaojin.sellmag.service;

import java.util.Map;

import org.j137.xiaojin.beans.Page;

/**
 * ����ѯ
 * @author Administrator
 *
 */
public interface ILoanService {
	public Page findByPage(int curPage,int pageSize,Map map);
}
