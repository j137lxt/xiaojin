package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Addressinfo;
/**
 * 户籍及居住业务层接口
 * @author Administrator
 *
 */
public interface IAddressinfoService {
	/**
	 * 保存地址信息
	 * @param address 地址信息对象
	 * @return
	 */
	public int saveAddressinfo(Addressinfo address);
	
	/**
	 * 根据用户ID查询户籍及居住信息
	 * @param id
	 * @return
	 */
	public Addressinfo findAddressinfo(long id);
//	/**
//	 * 
//	 * @param address 地址信息对象
//	 * @param id
//	 * @return
//	 */
//	public int updateAddressinfo(Addressinfo address,long id);
}
