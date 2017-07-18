package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Salesman;

/**
 * 新增销售员绑定申请信息
 * @author Administrator
 *
 */
public interface IBindApplyAddService {
	/**
	 * 提交绑定申请
	 * @param sale
	 * @return
	 */
	public int saveBindApply(Salesman sale);
	/**
	 * 删除绑定申请
	 * @param id
	 * @return
	 */
	public int deleteShopper(long id);
	/***
	 * 添加商户
	 * @return
	 */
	public int saveShopper();
}
