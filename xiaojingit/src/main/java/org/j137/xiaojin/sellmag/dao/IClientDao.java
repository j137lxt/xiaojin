package org.j137.xiaojin.sellmag.dao;

import java.util.List;
import java.util.Map;

import org.j137.xiaojin.beans.Client;

public interface IClientDao {

	public List<Client> findClient(Map map);
}
