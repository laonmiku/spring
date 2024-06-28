package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReviewVO {
	private int rid;
	private String gid;
	private String uid;
	private String contents;
	@JsonFormat(pattern="yyyy년MM월dd일 HH:mm:ss", timezone="Asia/Seoul")
	private Date regDate;
	private float rating;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "ReviewVO [rid=" + rid + ", gid=" + gid + ", uid=" + uid + ", contents=" + contents + ", regDate="
				+ regDate + ", rating=" + rating + "]";
	}
	
}
