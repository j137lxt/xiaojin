package org.j137.xiaojin.sellmag.service;

import java.util.Map;

import org.j137.xiaojin.beans.Page;

/**
 * ����Ա������ҵ���ӿ�
 * @author Administrator
 *
 */
public interface IBindApplyService {
	/**
	 * ��ҳ��̬ģ����ѯ
	 * @param curPage ��ǰҳ
	 * @param pageSize ÿҳ��ʾ����
	 * @param map ��̬ģ����ѯ����
	 * @return
	 */
	public Page findByPage(Map map,Page page);
} 