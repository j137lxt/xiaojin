package org.j137.xiaojin.basemag.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.j137.xiaojin.beans.Rebates;

public interface RebatesMapper {
	
	@Insert("INSERT INTO t_rebates(objcet,DISABLE,founder,DATE,Rebates_rate,cp_fk_id,TYPE) VALUES(#{bean.objcet},#{bean.disable},#{bean.founder.id},CURDATE(),#{bean.rebatesRate},#{bean.product.id},#{bean.type})")
	@Options(useGeneratedKeys=true,keyProperty="bean.id")
	public int add(@Param("bean")Rebates bean);
	/**
	 * idÊÇ²úÆ·id
	 * @param id
	 * @param bean
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="objcet",column="objcet",javaType=String.class),
		@Result(property="disable",column="DISABLE",javaType=Long.class),
		@Result(property="date",column="DATE",javaType=Date.class),
		@Result(property="rebatesRate",column="Rebates_rate",javaType=String.class),
		@Result(property="type",column="TYPE",javaType=String.class),
		@Result(property="founder.id",column="fid",javaType=Long.class),
		@Result(property="founder.loginName",column="fname",javaType=String.class),
		@Result(property="product.id",column="pid",javaType=Long.class)	
	})
	@Select("SELECT  c.id AS pid,b.id AS fid,b.login_name AS fname,a.* FROM  t_rebates a,t_user b,t_product c WHERE a.founder=b.id AND a.cp_fk_id=c.id AND a.id=#{id}")
	public List<Rebates> getlistpage(@Param("id")int id);

/*	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="name",column="stu_name",javaType=String.class),
		@Result(property="cls",javaType=Classes.class,column="fk_cls_id",one=@One(fetchType=FetchType.LAZY,select="getClassById"))
	})
	
	
	
	@Results({
		@Result(id=true,property="id",column="hId",javaType=Long.class),
		@Result(property="name",column="hName",javaType=String.class),
		@Result(property="wife.id",column="wId",javaType=Long.class),
		@Result(property="wife.name",column="wName",javaType=String.class)
	})*/
	
	
	
	
	
}
