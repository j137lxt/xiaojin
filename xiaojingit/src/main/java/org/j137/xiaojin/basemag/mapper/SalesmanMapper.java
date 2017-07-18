package org.j137.xiaojin.basemag.mapper;

import java.util.List;

import org.apache.catalina.Store;
import org.apache.ibatis.annotations.Param;
import org.j137.xiaojin.beans.PageBean;
import org.j137.xiaojin.beans.Salesman;

public interface SalesmanMapper {

	/**
	 * 查询所有在职员工
	 * @return
	 */
	public List<Salesman> findAllSalesman(@Param("buff")String buff,@Param("bean")PageBean bean);
	
	/**
	 * 模糊查询在职员工
	 * @param saleid  销售代码
	 * @param employeesid   员工编号
	 * @param salestate   销售状态
	 * @param employeesstate   员工状态
	 * @param index   当前页数
	 * @return 
	 */
	public List<Salesman> findAllsalesmanBysaleidAndemployeesid(@Param("saleid")String saleid,@Param("employeesid")String employeesid,@Param("salestate")String salestate,@Param("employeesstate")String employeesstate,@Param("bean")PageBean bean);
    
	/**
	 *  查询所有商户，商户下有门店集合，门店包含销售员和商户Bean
	 * @return
	 */
	public List<Store> findAllStore(PageBean bean);
	
	/**
	 * 根据员工姓名和员工所属机构查询员工   如果两个都为空则查询所有员工
	 * @param salename  员工姓名
	 * @param OrganizationId  机构名
	 * @return
	 */
    public List<Salesman> findAllSaleManByNameandOrganizationId(@Param("salename")String salename,@Param("OrganizationId")Long OrganizationId,@Param("bean")PageBean bean);
    
    /**
     * 根据员工ID返回员工实体对象
     * @param id
     * @return
     */
    public Salesman findSalemanById(@Param("saleman_id")Long id);
    
    /**
     * 查询总条数
     * @return
     */
    public long getAllUserCount();
}
