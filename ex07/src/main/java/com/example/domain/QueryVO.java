package com.example.domain;

public class QueryVO {
	private int page;
	private int start;
	private int size;
	private String key;
	private String word;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getStart() {
		return (page -1)* size ;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getWord() {
		return "%"+word+"%";
	}
	public void setWord(String word) {
		this.word = word;
	}
	@Override
	public String toString() {
		return "QueryVO [page=" + page + ", start=" + start + ", size=" + size + ", key=" + key + ", word=" + word
				+ "]";
	}
	
}
