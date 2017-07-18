package org.j137.xiaojin.sellmag.service;

import java.util.List;

import org.j137.xiaojin.beans.Salesman;
/**
 * 是否解绑
 * @author Administrator
 *
 */
public interface IIsUnBindService {
	/**
	 * 按照商户名称或者代码查找
	 * @param str
	 * @return
	 */
	public List<Salesman> findUnbindSaleBySaleCodeOrSaleName(String str);
}
