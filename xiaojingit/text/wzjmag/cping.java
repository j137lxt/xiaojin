package wzjmag;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.basemag.service.IProductService;
import org.j137.xiaojin.basemag.service.IRebatesService;
import org.j137.xiaojin.beans.Product;
import org.j137.xiaojin.beans.fenyebean;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class cping {


	@Resource
	private IProductService productServiceImp;
	@Resource
	private IRebatesService rebatesServiceImp;
	
	@Ignore
	public void add(){
		System.out.println();
		System.out.println();
		System.out.println("  "+"\n"+productServiceImp.getByid(1L)+"\n");
		Map map=new HashMap();
		fenyebean bean=new fenyebean();
		bean.setPage(1);
		bean.setRow(1);
		map.put("fenyebean",bean);
		
		System.out.println("\n"+new Date(System.currentTimeMillis())+"\n"+"\n");

	System.out.println("\n"+productServiceImp.getPage(map)+"\n");

	
	}
@Ignore
	public void aaa(){
		
		
		Product bean=new Product();
		productServiceImp.add(bean);

	}

@Test
public void aaas(){
	
	System.out.println(rebatesServiceImp.getlistpage(1));
	
}
	
}