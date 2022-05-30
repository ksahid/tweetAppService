package com.tweetapp.util;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Data


public class Envelope<T> {
	public int statusCode;
	public HttpStatus httpStatus;
	public T data;
	
	
	public Envelope() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Envelope(int statusCode, HttpStatus httpStatus, T data) {
		super();
		this.statusCode = statusCode;
		this.httpStatus = httpStatus;
		this.data = data;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
