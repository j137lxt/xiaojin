package org.j137.xiaojin.basemag.service;

import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Rebates;

public interface IRebatesService {
	
	public int add(Rebates bean);
	/**
	 * id�ǲ�Ʒid
	 * @param id
	 * @param bean
	 * @return
	 */
	public Page getlistpage(int id,Page bean);
	

}
