package org.j137.xiaojin.beans;


/**
 * ±¸×¢ÐÅÏ¢
 * @author Administrator
 * @version 1.0
 */
public class Remarkinfo {

	private long id;
	private String sellremark;

	public Remarkinfo(){

	}

	public Remarkinfo(String sellremark) {
		super();
		this.sellremark = sellremark;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSellremark() {
		return sellremark;
	}

	public void setSellremark(String sellremark) {
		this.sellremark = sellremark;
	}

	@Override
	public String toString() {
		return "Remarkinfo [id=" + id + ", sellremark=" + sellremark + "]";
	}

	

}