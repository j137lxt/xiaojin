package xiaojingit.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Store;
import org.j137.xiaojin.beans.Store2;
import org.j137.xiaojin.beans.StoreArea;
import org.j137.xiaojin.marketmag.service.IStoreService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//启动容器的方式
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class StoreTest {

	@Resource
	private IStoreService storeServiceImpl;
	@Ignore
	public void testAdd(){
		Map map=new HashMap<>();
		Store store=new Store("sws","ss","ddd","dd",2323l,"dd","ss","ss","dd","ss","ss","ddf","gf","h","gh","k","j","k","l","jj","gg","ff");
		System.out.println(store);
		Store2 store2=new Store2("qq","ww","ee","rr","tt","yyy","uu","ii","ooo","22","11","22","22","11","44");
		StoreArea storeArea=new StoreArea("qw","qw","qw","qw","qw","qw","qw");
		map.put("111", store);
		map.put("222", store2);
		map.put("333", storeArea);
		storeServiceImpl.addPer(map);
		
	}
	@Test
	public void testFindById(){
		Store store=storeServiceImpl.findStorePerById(14l);
		System.out.println(store);
	}
	@Ignore
	public void testUpdate(){
		Store store=storeServiceImpl.findStorePerById(14l);
		Store2 store2=store.getStore2();
		StoreArea storeArea=store.getStoreArea();
		
		Map map=new HashMap<>();
		store.setStoreDealMan("张三");
		store.setStoreAccountCode("嘻嘻");
		store.setStoreEmail("3473875@qq.com");
		store2.setStoreApplyType("特殊申请");
		store2.setStoreManName("李四");
		storeArea.setCity("成都市");
		storeArea.setProvince("四川省");
		System.out.println(store2);
		System.out.println(storeArea);
		map.put("11", store);
		map.put("22", store2);
		map.put("33", storeArea);
		storeServiceImpl.updateStoreInfo(14l,map);
		
		
		
	}
}
