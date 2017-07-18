package org.j137.xiaojin.marketmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.j137.xiaojin.beans.StoreArea;

public interface StoreAreaMapper {

	@Insert("insert t_storeArea (belongDepart,city,cityManager,departManager,province,sellArea,sellDepart) "
			+ "values(#{storeArea.belongDepart},#{storeArea.city},#{storeArea.cityManager},#{storeArea.departManager},#{storeArea.province},#{storeArea.sellArea},#{storeArea.sellDepart})")
	@Options(useGeneratedKeys=true,keyProperty="storeArea.id")
	public void addStoreAreainfo(@Param("storeArea")StoreArea storeArea);
	@ResultType(StoreArea.class)
	@Select("select * from t_storeArea where id=#{id}")
	public void findStoreAreaInfo(long id);
	@Update("update t_storeArea set city=#{storeArea.city},belongDepart=#{storeArea.belongDepart},cityManager=#{storeArea.cityManager},departManager=#{storeArea.departManager},province=#{storeArea.province},sellArea=#{storeArea.sellArea},sellDepart=#{storeArea.sellDepart} where id=#{storeArea.id}")
	public void updateStoreAreaInfo(@Param("storeArea")StoreArea storeArea);

}
