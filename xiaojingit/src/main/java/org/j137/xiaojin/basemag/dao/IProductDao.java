package org.j137.xiaojin.basemag.dao;

import java.util.List;
import java.util.Map;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Product;
import org.j137.xiaojin.beans.fenyebean;

public interface IProductDao {

	
	/**
	 * ��ҳ 
	 * @param map
	 * @return
	 */
	public   List<Product> getPage(Map map);
	
	public int  row(Map map);
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
	public  List<Product> getPage4biao(Map map);
	
	public Product getByid(Long id);

	public  int add(Product bean);
	
	
	
	
	
	
	
	
	
	
}
