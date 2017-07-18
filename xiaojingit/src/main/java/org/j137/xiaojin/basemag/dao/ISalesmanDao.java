package org.j137.xiaojin.basemag.dao;

import java.util.List;

import org.apache.catalina.Store;
import org.j137.xiaojin.beans.PageBean;
import org.j137.xiaojin.beans.Salesman;

/**
 * 销售员管理持久层
 * @author Administrator
 *
 */
public interface ISalesmanDao {

	/**
	 * 查询所有在职员工
	 * @return
	 */
	public List<Salesman> findAllSalesman(String buff,PageBean bean);
	
	/**
	 * 模糊查询在职员工
	 * @param saleid  销售代码
	 * @param employeesid   员工编号
	 * @param salestate   销售状态
	 * @param employeesstate   员工状态
	 * @param index   当前页数
	 * @return 
	 */
	public List<Salesman> findAllsalesmanBysaleidAndemployeesid(String saleid,String employeesid,String salestate,String employeesstate,PageBean bean);
    
	/**
	 *  查询所有商户，商户下有门店集合，门店包含销售员和商户Bean
	 * @return
	 */
	public List<Store> findAllStore(PageBean bean);
	
	/**
	 * 根据员工姓名和员工所属机构查询员工   如果两个都为空则查询所有员工
	 * @param salename  员工姓名
	 * @param OrganizationId  机构ID
	 * @return
	 */
    public List<Salesman> findAllSaleManByNameandOrganizationId(String salename,Long OrganizationId,PageBean bean);
    
    /**
     * 根据员工ID返回员工实体对象
     * @param id
     * @return
     */
    public Salesman findSalemanById(Long id);
    
    public long getAllUserCount();
}
