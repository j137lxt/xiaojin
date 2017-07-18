package org.j137.xiaojin.beans;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @created 13-7月-2017 11:39:39
 */
public class Page {

	private List<?> data;
	/**当前页数*/
	private int index;
	private int pageSize;
	private int tolPage;
	private int tolPoint;


	public Page(){

	}

	public void finalize() throws Throwable {

	}

	
	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public int getIndex() {
		index=(index-1)*pageSize;
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getPageSize() {
		
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTolPage() {
		tolPage=tolPoint%pageSize==0?(tolPoint/pageSize):(tolPoint/pageSize+1);
		return tolPage;
	}

	public void setTolPage(int tolPage) {
		this.tolPage = tolPage;
	}

	public int getTolPoint() {
		return tolPoint;
	}

	public void setTolPoint(int tolPoint) {
		this.tolPoint = tolPoint;
		
	}

	@Override
	public String toString() {
		return "Page [data=" + data + ", index=" + index + ", pageSize=" + pageSize + ", tolPage=" + tolPage
				+ ", tolPoint=" + tolPoint + "]";
	}

	
	
}
