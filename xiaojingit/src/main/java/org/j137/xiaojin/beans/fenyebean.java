package org.j137.xiaojin.beans;

import java.util.List;

public class fenyebean {
	private int id;
	private int page; //��ǰ��ҳ��
	private int row;  //ÿһҳ��ʾ����������
	private int totalPage;//�ܵĶ���ҳ
	private int totalRow; //�ܵ��ж���������
	private int index;   //���ݿ���Ҫ��
	private List<?> data;
	
	
	
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public List<?> getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
		index=(page-1)*row;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(int totalRow) {
		//��ȡ���ܵĶ��������ݾͿ���ֱ������ܵĶ���ҳ
		totalPage = (totalRow%row==0)?(totalRow/row):(totalRow/row)+1;
		this.totalRow = totalRow;
	}
	@Override
	public String toString() {
		return "fenyebean [id=" + id + ", page=" + page + ", row=" + row
				+ ", totalPage=" + totalPage + ", totalRow=" + totalRow
				+ ", data=" + data + "]";
	}
	
	
}
