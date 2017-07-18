package org.j137.xiaojin.marketmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.j137.xiaojin.beans.Store2;

public interface Store2Mapper {

	@Insert("insert t_store2 (store_applyType,store_commercialCode,store_competitor,store_IDCard,store_manName,store_manTel,store_name,store_orgCode,store_remarks,store_responsibleMan,store_resTel,store_societyCode,store_taxAccount,store_shijiName,store_shijiTel) "
			+ "values(#{store2.storeApplyType},#{store2.storeCommercialCode},#{store2.storeCompetitor},#{store2.storeIDCard},#{store2.storeManName},#{store2.storeManTel},#{store2.storeName},#{store2.storeOrgCode},#{store2.storeRemarks},#{store2.storeResponsibleMan},#{store2.storeResTel},#{store2.storeSocietyCode},#{store2.storeTaxAccount},#{store2.storeShijiName},#{store2.storeShijiTel})")
	@Options(useGeneratedKeys=true,keyProperty="store2.id")
	public void addStore2Info(@Param("store2")Store2 store2);
	@ResultType(Store2.class)
	@Select("select id as id,store_commercialCode as storeCommercialCode,store_competitor as storeCompetitor,store_IDCard as storeIDCard,store_manName as storeManName,store_manTel as storeManTel,store_orgCode as storeOrgCode,store_remarks as storeRemarks,store_responsibleMan as storeResponsibleMan,store_resTel as storeResTel,store_societyCode as storeSocietyCode,store_taxAccount as storeTaxAccount,store_shijiName as storeShijiName,store_shijiTel as storeShijiTel,store_applyType as storeApplyType from t_store2 where id=#{id}")
	public void findStore2Info(@Param("id")long id);
	@Update("update t_store2 set store_applyType=#{store2.storeApplyType},store_commercialCode=#{store2.storeCommercialCode},store_competitor=#{store2.storeCompetitor},store_IDCard=#{store2.storeIDCard},store_manName=#{store2.storeManName},store_manTel=#{store2.storeManTel},store_name=#{store2.storeName},store_orgCode=#{store2.storeOrgCode},store_remarks=#{store2.storeRemarks},store_responsibleMan=#{store2.storeResponsibleMan},store_resTel=#{store2.storeResTel},store_societyCode=#{store2.storeSocietyCode},store_taxAccount=#{store2.storeTaxAccount},store_shijiName=#{store2.storeShijiName},store_shijiTel=#{store2.storeShijiTel} where id=#{store2.id}")
	public void updateStore2Info(@Param("store2")Store2 store2);
}
