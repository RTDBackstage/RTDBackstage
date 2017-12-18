package com.rtdback.util;

import java.util.List;

public class Pager<T> {
	private long total;
	private List<T> rows;
	private long pagerNum;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public long getPagerNum() {
		return pagerNum;
	}
	public void setPagerNum(long pagerNum) {
		this.pagerNum = pagerNum;
	}
	
	
	
}
