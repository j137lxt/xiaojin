package org.j137.xiaojin.sellmag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Client;
import org.j137.xiaojin.sellmag.dao.IClientDao;
import org.j137.xiaojin.sellmag.service.IClientService;
import org.springframework.stereotype.Service;
@Service
public class ClientServiceImpl implements IClientService{
@Resource
private IClientDao clientDaoImpl;
	
	@Override
	public List<Client> findClient(Map map) {
		
		return null;
	}

}
