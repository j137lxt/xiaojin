package org.j137.xiaojin.basemag.service;

import java.util.List;

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
	public List<Rebates> getlistpage(int id);

}
