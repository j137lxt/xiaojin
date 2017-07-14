package org.j137.xiaojin.systemmag.service;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.User;

import com.sun.javafx.collections.MappingChange.Map;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-7��-2017 11:39:39
 */
public interface IUserService {
	/**
	 * �����û�
	 * 
	 * @param user
	 */
	public void saveUser(User user);

	/**
	 * �޸��û�
	 * 
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * �߼�ɾ���û�
	 * 
	 * @param user
	 */
	public void deleteUser(Long id);

	/**
	 * ��ѯ��ְ�û�
	 * 
	 * @param user
	 */
	public Page findAllUser(Page page);

	/**
	 * ������ѯ�û�
	 * 
	 * @param map
	 * @return
	 */
	public Page findUserByItem(Map map);
}