package com.example.domain;

public class QueryVO {
	private int page;
	private  int size;
	private int start;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getStart() {
		return (page-1) * size;
	}
	public void setStart(int start) {
		this.start = start;
	}
	@Override
	public String toString() {
		return "QueryVO [page=" + page + ", size=" + size + ", start=" + start + "]";
	}
	
	
}
