package org.j137.xiaojin.basemag.dao;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Rebates;

public interface IRebatesDao {
	
	public int add(Rebates bean);
	/**
	 * id�ǲ�Ʒid
	 * @param id
	 * @param bean
	 * @return
	 */
	public Page getlistpage(int id,Page bean);
}
