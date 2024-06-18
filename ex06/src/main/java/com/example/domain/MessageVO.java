package com.example.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MessageVO extends UserVO{
	private int mid;
	private String sender;
	private String receiver;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date sendDate;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date readDate;
	private String message;
	private int sendDelete;
	private int receiveDelete;
	
	public int getSendDelete() {
		return sendDelete;
	}
	public void setSendDelete(int sendDelete) {
		this.sendDelete = sendDelete;
	}
	public int getReceiveDelete() {
		return receiveDelete;
	}
	public void setReceiveDelete(int receiveDelete) {
		this.receiveDelete = receiveDelete;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public Date getReadDate() {
		return readDate;
	}
	public void setReadDate(Date readDate) {
		this.readDate = readDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "MessageVO [mid=" + mid + ", sender=" + sender + ", receiver=" + receiver + ", sendDate=" + sendDate
				+ ", readDate=" + readDate + ", message=" + message + "]";
	}
}