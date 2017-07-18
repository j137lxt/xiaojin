package org.j137.xiaojin.sellmag.service;

import org.j137.xiaojin.beans.Concaterinfo;
import org.j137.xiaojin.beans.Otherinfo;

public interface IOtherinfoService {
	/**
	 * ����������Ϣ
	 * @param other ������Ϣ����
	 * @return
	 */
	public int saveOtherinfo(Otherinfo other);
	
	/**
	 * ������ϵ��
	 * @param concate ��ϵ�˶���
	 * @return
	 */
	public int saveConcaterinfo(Concaterinfo concate);
	
	/**
	 * ����ID�鿴��ϵ�˺�������Ϣ
	 * @param id
	 * @return
	 */
	public Concaterinfo findConcater(long id);
	
	/**
	 * ����ID�鿴������Ϣ
	 * @param id
	 * @return
	 */
	public Otherinfo findOtherinfo(long id);
	
	
	/**
	 * ɾ��������Ϣ
	 * @param id
	 * @return
	 */
	public int deleteOtherinfo(long id);
}
