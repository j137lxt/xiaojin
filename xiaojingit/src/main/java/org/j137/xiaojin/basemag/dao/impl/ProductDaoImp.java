package org.j137.xiaojin.basemag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.basemag.dao.IProductDao;
import org.j137.xiaojin.basemag.mapper.ProductMapper;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Product;
import org.j137.xiaojin.beans.fenyebean;
import org.springframework.stereotype.Repository;
@Repository
public class ProductDaoImp implements IProductDao {
@Resource
private  ProductMapper mp;
	@Override
	public List<Product> getPage(Map map) {
	System.out.println(map);
		return mp.getPage(map);
	}

	@Override
	public int row(Map map) {
		System.out.println("\n"+mp.row(map)+"\n");
		return mp.row(map);
	}

	@Override
	public int update(Map map) {
		// TODO Auto-generated method stub
		return mp.update(map);
	}

	@Override
	public int updatebuff(int id, String buff) {
		// TODO Auto-generated method stub
		return mp.updatebuff(id, buff);
	}

	@Override
	public List<Product> getPage4biao(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getByid(Long id) {
		// TODO Auto-generated method stub
		return mp.getByid(id);
	}

	@Override
	public int add(Product bean) {
		// TODO Auto-generated method stub
		return mp.add(bean);
	}

}
