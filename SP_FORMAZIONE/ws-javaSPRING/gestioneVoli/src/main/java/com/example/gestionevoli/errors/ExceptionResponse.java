package com.example.gestionevoli.errors;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timeStamp;
	private String msg;
	private String details;
	
	public ExceptionResponse(Date timeStamp, String msg, String details) {
		this.timeStamp = timeStamp;
		this.msg = msg;
		this.details = details;
	}
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	public String getMsg() {
		return msg;
	}
	public String getDetails() {
		return details;
	}
	
	
	

}
