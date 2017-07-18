package org.j137.xiaojin.sellmag.service;

import java.util.List;

import org.j137.xiaojin.beans.Salesman;

/**
 * 是否绑定
 * @author Administrator
 *
 */
public interface IIsBindService {
	/**
	 * 按照商户名称或者代码查找
	 * @param str
	 * @return
	 */
	public List<Salesman> findSaleBySaleCodeOrSaleName(String str);
}
