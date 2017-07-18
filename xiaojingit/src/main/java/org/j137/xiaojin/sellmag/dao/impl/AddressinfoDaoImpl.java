package org.j137.xiaojin.sellmag.dao.impl;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Addressinfo;
import org.j137.xiaojin.sellmag.dao.IAddressinfoDao;
import org.j137.xiaojin.sellmag.mapper.AddressinfoMapper;
import org.springframework.stereotype.Repository;
@Repository
public class AddressinfoDaoImpl implements IAddressinfoDao {
	@Resource
	private AddressinfoMapper am;
	
	public int saveAddressinfo(Addressinfo address) {
		// TODO Auto-generated method stub
		return am.saveAddressinfo(address);
	}

	public Addressinfo findAddressinfo(long id) {
		// TODO Auto-generated method stub
		return am.findAddressinfo(id);
	}

}
