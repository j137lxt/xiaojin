package org.j137.xiaojin.basemag.dao;

import java.util.List;

import org.j137.xiaojin.beans.Bank;
import org.j137.xiaojin.beans.PageBean;

/**
 * 银行信息管理持久层
 * @author Administrator
 *
 */
public interface IBankDao {
	
	/**
	 * 查看所有银行信息
	 * @return PageBean 分页Bean对象
	 */
	public List<Bank> findAllBank();
	
	/**
	 * 新添银行
	 * @param bank
	 */
	public void addBank(Bank bank);
	
	/**
	 * 修改银行
	 * @param bank 
	 */
	public void updateBank(Bank bank,Long id);
	
	/**
	 * 删除银行
	 * @param id
	 */
	public void deleteBank(Long id);

}
