package org.j137.xiaojin.basemag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.j137.xiaojin.beans.Product;
import org.j137.xiaojin.beans.fenyebean;

public interface ProductMapper {

	
	
	
	public int row(@Param("map")Map map);
	
	
	
		public  List<Product> getPage(@Param("map")Map map);
		/**
		 * map �����޸Ķ��� ���޸��˺��޸�ʱ��
		 * @param map
		 * @return
		 */
		public int update(@Param("map")Map map);
		/**
		 * ��������
		 * @param id
		 * @param buff
		 * @return
		 */
		public int updatebuff(int id,String buff);
		/**
		 * ���̻�����÷�ҳ
		 * @param map
		 * @return
		 */
		public  List<Product> getPage4biao(Map map);
		
		public Product getByid(Long id);

		public  int add(@Param("bean")Product bean);
		
	
	
	
	
	
}
