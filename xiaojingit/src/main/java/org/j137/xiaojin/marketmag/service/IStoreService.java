package org.j137.xiaojin.marketmag.service;

import java.util.Map;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Store;

public interface IStoreService {

	/**
	 * �̻���ҳչʾ
	 * @param map
	 * @param page
	 * @return
	 */
	public Page findStorePagePer(Map map);
	/**
	 * ����̻�
	 * @param map
	 */
	public void addPer(Map map);
	
	/**
	 * ��ѯ�̻���Ϣ
	 * @param id
	 * @return 
	 */
	public Store findStorePerById(Long id);
	/**
	 * ����id�޸��̻�
	 * @param id
	 */
	public void updateStoreInfo(Long id,Map map);
}
