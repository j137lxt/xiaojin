package org.j137.xiaojin.sellmag.service;

import java.util.List;

import java.util.Map;

import org.j137.xiaojin.beans.Client;

public interface IClientmapper {
	public List<Client> findClient(Map map);
}
