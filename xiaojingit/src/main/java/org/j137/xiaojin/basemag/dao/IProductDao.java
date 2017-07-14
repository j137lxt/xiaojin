package org.j137.xiaojin.basemag.dao;

import java.util.Map;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Product;

public interface IProductDao {

	
	/**
	 * 分页 
	 * @param map
	 * @return
	 */
	public  Page getPage(Map map);
	/**
	 * map 保护修改对象 和修改人和修改时间
	 * @param map
	 * @return
	 */
	public int update(Map map);
	/**
	 * 审核哪里的
	 * @param id
	 * @param buff
	 * @return
	 */
	public int updatebuff(int id,String buff);
	/**
	 * 绑定商户哪里得分页
	 * @param map
	 * @return
	 */
	public  Page getPage4biao(Map map);
	
	public Product getByid();

	public  int add(Product bean);
	
	
	
	
	
	
	
	
	
	
}
