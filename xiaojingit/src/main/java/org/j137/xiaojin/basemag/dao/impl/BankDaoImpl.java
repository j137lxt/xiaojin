package org.j137.xiaojin.basemag.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.j137.xiaojin.basemag.dao.IBankDao;
import org.j137.xiaojin.basemag.mapper.BankMapper;
import org.j137.xiaojin.beans.Bank;
import org.j137.xiaojin.beans.PageBean;
import org.springframework.stereotype.Repository;

@Repository
public class BankDaoImpl implements IBankDao{

	@Resource
	private BankMapper bm;
	
	@Override
	public List<Bank> findAllBank() {
		// TODO Auto-generated method stub
		return bm.findAllBank();
	}

	@Override
	public void addBank(Bank bank) {
		// TODO Auto-generated method stub
		bm.addBank(bank);
	}

	@Override
	public void updateBank(Bank bank,Long id) {
		// TODO Auto-generated method stub
		bm.updateBank(bank,id);
	}

	@Override
	public void deleteBank(Long id) {
		// TODO Auto-generated method stub
		bm.deleteBank(id);
	}

}
