package org.j137.xiaojin.sellmag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Client;
import org.j137.xiaojin.sellmag.dao.IClientDao;
import org.j137.xiaojin.sellmag.mapper.ClientMapper;
import org.springframework.stereotype.Repository;
@Repository
public class ClientDaoImpl implements IClientDao {

	@Resource
	private ClientMapper cm;
	@Override
	public List<Client> findClient(Map map) {
		// TODO Auto-generated method stub
		return cm.findClient(map);
	}

}
