package org.j137.xiaojin.sellmag.service;

import java.util.List;

import org.j137.xiaojin.beans.Salesman;

/**
 * �Ƿ��
 * @author Administrator
 *
 */
public interface IIsBindService {
	/**
	 * �����̻����ƻ��ߴ������
	 * @param str
	 * @return
	 */
	public List<Salesman> findSaleBySaleCodeOrSaleName(String str);
}
