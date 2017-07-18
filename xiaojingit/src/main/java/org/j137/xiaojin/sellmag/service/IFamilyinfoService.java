package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Familyinfo;
/**
 * 家庭信息业务层接口
 * @author Administrator
 *
 */
public interface IFamilyinfoService {
	/**
	 * 保存家庭信息
	 * @param family 家庭信息对象
	 * @return
	 */
	public int saveFamilyinfo(Familyinfo family);
	
	/**
	 * 查询家庭信息
	 * @param id
	 * @return
	 */
	public Familyinfo findFamilyinfo(long id);
//	/**
//	 * 修改家庭信息
//	 * @param family 家庭信息对象
//	 * @param id
//	 * @return
//	 */
//	public int updateFamilyinfo(Familyinfo family,long id);
}
