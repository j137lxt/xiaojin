package org.j137.xiaojin.basemag.dao;

import java.util.List;
import java.util.Map;

import org.j137.xiaojin.beans.Nper;

public interface INperDao {
	
	

	public int addNper(Nper bean);
	/**
	 * map �����޸Ķ��� ���޸��˺��޸�ʱ��
	 * @param map
	 * @return
	 */
	public int updateNper(Map map);
	
	public Nper getByid(int id);
	/**
	 * �����id�ǲ�Ʒ��  ���ݲ�Ʒid�����������������
	 *
	 * @param id
	 * @return
	 */
	public  List<Nper> getPridListNper(int id);

}
