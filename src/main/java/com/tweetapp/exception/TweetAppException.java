package com.tweetapp.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@Getter
public class TweetAppException extends RuntimeException {
	private static final long serialVersionUID = 1558149957272449535L;
	private int statusCode;
	private HttpStatus status;
	private String data;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public TweetAppException(int statusCode, HttpStatus status, String data) {
		super();
		this.statusCode = statusCode;
		this.status = status;
		this.data = data;
	}
	
	
	
}
