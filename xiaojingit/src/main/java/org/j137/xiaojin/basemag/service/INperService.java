package org.j137.xiaojin.basemag.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.j137.xiaojin.beans.Nper;
import org.j137.xiaojin.beans.User;

public interface INperService {
	
	public int addNper(Nper bean);
	/**
	 * map �����޸Ķ��� ���޸��˺��޸�ʱ��
	 * @param map
	 * @return
	 */
	public int updateNper(Nper bean);
	

	
	public Nper getByid(Long id);
	/**
	 * �����id�ǲ�Ʒ��  ���ݲ�Ʒid�����������������
	 *
	 * @param id
	 * @return
	 */
	public  List<Nper> getPridListNper(Long id);

	

}
