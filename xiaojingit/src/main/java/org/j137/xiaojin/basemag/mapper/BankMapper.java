package org.j137.xiaojin.basemag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.j137.xiaojin.beans.Bank;
import org.j137.xiaojin.beans.PageBean;

public interface BankMapper {

	/**
	 * 查看所有银行信息
	 * 
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
	public void updateBank(@Param("bank")Bank bank,@Param("Bid")Long id);
	
	/**
	 * 删除银行
	 * @param id
	 */
	public void deleteBank(Long id);
	
}
