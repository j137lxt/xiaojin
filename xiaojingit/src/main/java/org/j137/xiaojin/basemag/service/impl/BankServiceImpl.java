package org.j137.xiaojin.basemag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.j137.xiaojin.basemag.dao.IBankDao;
import org.j137.xiaojin.basemag.service.IBankService;
import org.j137.xiaojin.beans.Bank;
import org.j137.xiaojin.beans.PageBean;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements IBankService{

	@Resource
	private IBankDao bankDaoImpl;
	
	@Override
	public List<Bank> findAllBank() {
		// TODO Auto-generated method stub
		return bankDaoImpl.findAllBank();
	}

	@Override
	public void addBank(Bank bank) {
		// TODO Auto-generated method stub
		bankDaoImpl.addBank(bank);
	}

	@Override
	public void updateBank(Bank bank,Long id) {
		// TODO Auto-generated method stub
		bankDaoImpl.updateBank(bank,id);
	}

	@Override
	public void deleteBank(Long id) {
		// TODO Auto-generated method stub
		bankDaoImpl.deleteBank(id);
	}

}
