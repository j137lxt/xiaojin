package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Salesman;

/**
 * ��������Ա��������Ϣ
 * @author Administrator
 *
 */
public interface IBindApplyAddService {
	/**
	 * �ύ������
	 * @param sale
	 * @return
	 */
	public int saveBindApply(Salesman sale);
	/**
	 * ɾ��������
	 * @param id
	 * @return
	 */
	public int deleteShopper(long id);
	/***
	 * ����̻�
	 * @return
	 */
	public int saveShopper();
}
