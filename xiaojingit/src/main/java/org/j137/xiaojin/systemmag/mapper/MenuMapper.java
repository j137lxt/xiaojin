package org.j137.xiaojin.systemmag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.j137.xiaojin.beans.Menu;

public interface MenuMapper {

	/**
	 * ����˵�  1����ְ��0����ְ
	 * @param menu
	 */
	@Insert("insert into t_menu values(null,#{menu.menuName},#{menu.icon},#{menu.link},#{menu.authority},#{menu.origin},#{menu.sort},#{menu.state},#{menu.remark},1)")
	public void saveMenu(@Param("menu")Menu menu);
	/**
	 * �޸Ĳ˵� 
	 * @param menu
	 */
	public void updateMenu(Menu menu);
	/**
	 * �߼�ɾ���˵� 
	 * @param menu
	 */
	@Update("update t_menu set exist=0 where id=#{id}")
	public void deleteMenu(Long id);
	/**
	 * ��ѯ�˵� 
	 * @param menu
	 */
	public List findMenu(Map map);
	/**
	 *��ѯ����Ŀ 
	 */
	@ResultType(Integer.class)
	@Select("select count(id) as num from t_menu where exist=1")
	public int findMenuNum();
}
