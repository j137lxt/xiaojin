package org.j137.xiaojin.systemmag.service;

import java.util.Map;

import org.j137.xiaojin.beans.Menu;
import org.j137.xiaojin.beans.Page;


/**
 * @author Administrator
 * @version 1.0
 * @created 13-7��-2017 11:39:39
 */
public interface IMenuService {
	/**
	 * ����˵� 
	 * @param menu
	 */
	public void saveMenu(Menu menu);
	/**
	 * �޸Ĳ˵� 
	 * @param menu
	 */
	public void updateMenu(Menu menu);
	/**
	 * �߼�ɾ���˵� 
	 * @param menu
	 */
	public void deleteMenu(Long id);
	/**
	 * ��ѯ�˵� 
	 * @param menu
	 */
	public Page findMenu(Page page);
	/**
	 * ������ѯ�˵�
	 * @param map
	 * @return
	 */
	public Page findMenuByItem(Map map);
}