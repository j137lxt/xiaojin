package org.j137.xiaojin.basemag.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.j137.xiaojin.beans.Nper;
import org.j137.xiaojin.beans.User;

public interface INperService {
	
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
