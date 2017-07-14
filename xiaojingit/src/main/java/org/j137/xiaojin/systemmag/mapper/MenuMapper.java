package org.j137.xiaojin.systemmag.mapper;

import java.util.Map;

import org.j137.xiaojin.beans.Menu;
import org.j137.xiaojin.beans.Page;

public interface MenuMapper {

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
	public Page findMenu(Map map);
}
