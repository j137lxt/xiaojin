package wzjmag;

import javax.annotation.Resource;

import org.j137.xiaojin.basemag.service.INperService;
import org.j137.xiaojin.beans.Nper;
import org.j137.xiaojin.beans.Product;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class NperText {
	@Resource
	private INperService nperSerivceImp;
	
	@Test
	public void add(){
		
/*		public Nper(String guarantee,  String insuranceRate,
				String lapseRate, String lminoan, String maxnoan, String nper,
				String platformRate, Product productCode, String refundRate,
				String serviceRate) {
			super();
			this.guarantee = guarantee;
			this.insuranceRate = insuranceRate;
			this.lapseRate = lapseRate;
			this.lminoan = lminoan;
			this.maxnoan = maxnoan;
			this.nper = nper;
			this.platformRate = platformRate;
			this.productCode = productCode;
			this.refundRate = refundRate;
			this.serviceRate = serviceRate;
		}*/

		Product pr=new Product();
		pr.setId(1);
	
		Nper bean=new Nper("1担保","1月保险手续费率","1递减率","1最小贷款金额","1最大贷款金额","1期数","平台手续费率",pr,"退款率","服务费率");
		nperSerivceImp.addNper(bean);
		System.out.println(nperSerivceImp.getByid(bean.getId()));
		
	}
	@Ignore
	public void getbyid(){
		
		System.out.println(nperSerivceImp.getByid(1L));
		System.out.println("  ");
		System.out.println("  ");
	//	per [guarantee=担保, id=0, insuranceRate=null, lapseRate=null, lminoan=最小贷款金额, maxnoan=最大贷款金额, nper=期数, platformRate=null, productCode=null, refundRate=null, serviceRate=null, getClass()=class org.j137.xiaojin.beans.Nper, hashCode()=2082351661, toString()=org.j137.xiaojin.beans.Nper@7c1e2a2d]
				  
	}

}
