package org.j137.xiaojin.basemag.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.eclipse.jdt.core.compiler.IProblem;
import org.j137.xiaojin.basemag.dao.IProductDao;
import org.j137.xiaojin.basemag.service.IProductService;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.beans.Product;
import org.j137.xiaojin.beans.fenyebean;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImp implements IProductService {

	@Resource
	private IProductDao productDaoImp;
	@Override
	public fenyebean getPage(Map map) {
		fenyebean bean=(fenyebean) map.get("fenyebean");
		System.out.println(bean);
		bean.setTotalRow(productDaoImp.row(map));
		bean.setData(productDaoImp.getPage(map));
		return bean;
	}

	@Override
	public int update(Map map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatebuff(int id, String buff) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public fenyebean getPage4biao(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getByid(Long id) {
		// TODO Auto-generated method stub
		return productDaoImp.getByid(id);
	}

	@Override
	public int add(Product bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
