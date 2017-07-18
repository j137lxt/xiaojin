package org.j137.xiaojin.marketmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.j137.xiaojin.beans.Store;

public interface StoreMapper {
	@Insert("insert t_store (store_accountCode,store_accountType,store_applicationTime,store_cautionMoney,store_code,store_dealMan,store_email,store_name,store_perjuducation,store_proessingTime,store_reasonMark,store_specialReason,store_stutis,store_type,store_updateReason,store_updateType,store_withhold,stroe_activeTime,stroe_address,stroe_contractTime,stroe_specialType,stroe_way) "
			+ "values(#{store.storeAccountCode},#{store.storeAccountType},#{store.storeApplicationTime},#{store.storeCautionMoney},#{store.storeCode},#{store.storeDealMan},#{store.storeEmail},#{store.storeName},#{store.storePerjuducation},#{store.storeProessingTime},#{store.storeReasonMark},#{store.storeSpecialReason},#{store.storeStutis},#{store.storeType},#{store.storeUpdateReason},#{store.storeUpdateType},#{store.storeWithhold},#{store.stroeActiveTime},#{store.stroeAddress},#{store.stroeContractTime},#{store.stroeSpecialType},#{store.stroeWay})")
	@Options(useGeneratedKeys=true,keyProperty="store.id")
	public void addStoreInfo(@Param("store")Store store);
	//@ResultMap("storeMap")
	//@Select("select * from t_store where id=#{id}")
	public Store findStoreInfo(@Param("id")Long id);
	@Update("update t_store set store_accountCode = #{store.storeAccountCode},store_accountType = #{store.storeAccountType},store_dealMan=#{store.storeDealMan},store_applicationTime=#{store.storeApplicationTime},store_cautionMoney=#{store.storeCautionMoney},store_code=#{store.storeCode},store_email=#{store.storeEmail},store_name=#{store.storeName},store_perjuducation=#{store.storePerjuducation},store_proessingTime=#{store.storeProessingTime},store_reasonMark=#{store.storeReasonMark},store_specialReason=#{store.storeSpecialReason},store_stutis=#{store.storeStutis},store_type=#{store.storeType},store_updateReason=#{store.storeUpdateReason},store_updateType=#{store.storeUpdateType},store_withhold=#{store.storeWithhold},stroe_activeTime=#{store.stroeActiveTime},stroe_contractTime=#{store.stroeContractTime},stroe_specialType=#{store.stroeSpecialType},stroe_way=#{store.stroeWay} where id = #{store.id}")
	public void updateStoreInfo(@Param("store")Store store);
	
	public int countStoreListByMapToPager(@Param("map")Map map);
	
	public List<?> findStoreListByMapToPager(@Param("map")Map map);
	
}
