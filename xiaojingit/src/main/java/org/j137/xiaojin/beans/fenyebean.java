package org.j137.xiaojin.beans;

import java.util.List;

public class fenyebean {
	private int id;
	private int page; //当前的页码
	private int row;  //每一页显示多少条数据
	private int totalPage;//总的多少页
	private int totalRow; //总的有多少条数据
	private int index;   //数据库需要的
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
		//获取到总的多少条数据就可以直接算出总的多少页
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
