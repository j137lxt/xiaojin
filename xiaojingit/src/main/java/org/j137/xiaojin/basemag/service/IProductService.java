package org.j137.xiaojin.basemag.service;

import java.util.Date;
import java.util.Map;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Product;
import org.j137.xiaojin.beans.User;
import org.j137.xiaojin.beans.fenyebean;

public interface IProductService {
	/**
	 * ��ҳ 
	 * @param map
	 * @return
	 */
	public  fenyebean getPage(Map map);
	/**
	 * map �����޸Ķ��� ���޸��˺��޸�ʱ��
	 * @param map
	 * @return
	 */
	public int update(Map map);
	/**
	 * ��������
	 * @param id
	 * @param buff
	 * @return
	 */
	public int updatebuff(int id,String buff);
	/**
	 * ���̻�����÷�ҳ
	 * @param map
	 * @return
	 */
	public  fenyebean getPage4biao(Map map);
	
	public Product getByid(Long id);

	public  int add(Product bean);
	
	
	
	
	
	
	
	
	
	

}
