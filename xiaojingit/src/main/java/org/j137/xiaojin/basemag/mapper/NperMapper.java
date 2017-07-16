package org.j137.xiaojin.basemag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.j137.xiaojin.beans.Nper;

public interface NperMapper {
	
	
	
	
	
	
	
	@Insert("INSERT INTO t_nper(Product_code,nper,service_rate,guarantee,insurance_rate,Platform_rate,Refund_rate,Lapse_rate,lminoan,maxnoan)"+
 " VALUES (#{bean.productCode.id},#{bean.nper} ,#{bean.serviceRate},#{bean.guarantee},#{bean.insuranceRate},#{bean.platformRate}"
 + ",#{bean.refundRate},#{bean.lapseRate},#{bean.lminoan},#{bean.maxnoan})") 
	@Options(useGeneratedKeys=true,keyProperty="bean.id")
	public int addNper(@Param("bean")Nper bean);
	/**
	 * map 保护修改对象 和修改人和修改时间
	 * @param map
	 * @return
	 */
	@Delete("UPDATE t_nper SET nper=#{bean.nper} ,service_rate=#{bean.serviceRate} ,guarantee=#{bean.guarantee} ,insurance_rate=#{bean.insuranceRate},Platform_rate= #{bean.platformRate},Refund_rate= #{bean.refundRate},Lapse_rate= #{bean.lapseRate},lminoan=#{bean.lminoan},maxnoan=#{bean.maxnoan}  WHERE id=${bean.id}")
	public int updateNper(@Param("bean")Nper bean);

	@Select("select id as id,guarantee as guarantee ,insurance_rate as  insuranceRate,Platform_rate as  platformRate,service_rate as  serviceRate,Lapse_rate as lapseRate,Refund_rate as  refundRate"
			+ ",lminoan as lminoan,maxnoan as maxnoan,nper as nper        from t_nper where id=#{id}")
	public Nper getByid(@Param("id")Long id);
	/**
	 * 这里的id是产品的  根据产品id、叉出他的期数集合
	 *
	 * @param id
	 * @return
	 */
	@Select("select id as id,guarantee as guarantee ,insurance_rate as  insuranceRate,Platform_rate as  platformRate,service_rate as  serviceRate,Lapse_rate as lapseRate,Refund_rate as  refundRate"
			+ ",lminoan as lminoan,maxnoan as maxnoan,nper as nper  from t_nper where Product_code=#{id}")
	public  List<Nper> getPridListNper(@Param("id")Long id);
	
	

}
