package org.j137.xiaojin.basemag.dao;

import java.util.List;
import java.util.Map;

import org.j137.xiaojin.beans.Nper;

public interface INperDao {
	
	

	public int addNper(Nper bean);
	/**
	 * map 保护修改对象 和修改人和修改时间
	 * @param map
	 * @return
	 */
	public int updateNper(Nper bean);
	
	public Nper getByid(Long id);
	/**
	 * 这里的id是产品的  根据产品id、叉出他的期数集合
	 *
	 * @param id
	 * @return
	 */
	public  List<Nper> getPridListNper(Long id);

}
