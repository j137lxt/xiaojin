package org.j137.xiaojin.basemag.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.j137.xiaojin.beans.PageBean;
import org.j137.xiaojin.beans.Store;
import org.j137.xiaojin.beans.Stores;

public interface StoresMapper {

	/**
	 * 查询所有已激活的商户
	 * @param buff  商户状态为已激活
	 * @return
	 */
    public List<Store> findAllStore(@Param("buff")String buff,@Param("bean")PageBean bean);
    
    /**
     * 模糊查询商户
     * @param daima 商户代码
     * @param mingcheng 商户名称
     * @param buff 激活状态
     * @param fengxiandengji  商户风险等级
     * @param leixing  专家商户类型
     * @param sheng  省
     * @param shi   市
     * @param daqu   销售大区
     * @param dengji  商户等级
     * @param startime  申请时间(开始)
     * @param endtime   申请时间(结束)
     * @param shenpitime  审批时间(开始)
     * @param endshenpitime  审批时间(结束)
     * @param index  (当前页数)
     * @return 分页Bean 商户集合
     */
    public List<Store> mohuFindStore(@Param("daima")String daima,@Param("mingcheng")String mingcheng,@Param("buff")String buff,@Param("fengxiandengji")String fengxiandengji,@Param("leixing")String leixing,
    @Param("startime")Date startime,@Param("endtime")Date endtime,@Param("shenpitime")Date shenpitime,@Param("endshenpitime")Date endshenpitime,@Param("bean")PageBean bean);
    
    /**
     * 根据商户ID查询商户下所有的门店
     * @param id 商户ID
     * @return
     */
    public List<Stores> findStoresBystoreId(@Param("id")Long id);
    
    /**
     * 新增门店
     * @param stores
     */
    public void addStores(Stores stores);
    
    /**
     * 修改门店
     * @param stores
     */
    public void updateStores(Stores stores);
    
    /**
     * 根据门店ID模糊查询销售员，根据门店ID查询所有销售员
     * @param id 门店ID
     * @param daima 销售代码
     * @param bianhao 员工编号
     * @param zhuangtai 销售状态
     * @param yaungongzhuangtai  员工状态
     * @param index 当前页数
     * @return 返回PageBean 集合里面存储销售员集合
     */
    public PageBean findSalesmanByStoresId(Long id,String daima,String bianhao,String zhuangtai,String yaungongzhuangtai,int index);
    
    /**
     * 根据销售员ID查询所有绑定的门户,以及门户所对应的商户
     * @param id
     * @return
     */
    public List<Stores> findAllStores(Long id);
    
    /**
     * 根据商户ID返回商户详细信息
     * @param id 商户ID
     * @return 商户对象Bean
     */
    public Store findStoreById(Long id);
    
    /**
     * 根据商户ID修改商户详细信息
     * @param id 商户ID
     */
    public void updateStoreById(Long id);
    
    /**
     * 查询商户总条数
     * @return
     */
    public long getAllStoreCount();
    
    /**
     * 查询门店总条数
     * @return
     */
    public long getAllStoresCount();
}
