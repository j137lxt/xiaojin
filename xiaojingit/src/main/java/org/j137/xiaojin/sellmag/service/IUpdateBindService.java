package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Salesman;

/**
 * �������޸ĺ���ϸ��Ϣ
 * @author Administrator
 *
 */
public interface IUpdateBindService {
	/**
	 * ����ID��ѯ����Ա
	 * @param id
	 * @return
	 */
	public Salesman findSalesmanById(long id);
	/**
	 * ����ID�޸�����Ա
	 * @param sale
	 * @param id
	 * @return
	 */
	public Salesman updateSalesman(Salesman sale,long id);
}
