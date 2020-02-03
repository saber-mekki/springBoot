package com.example.jpa.error;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;


public class ValidationError {
	public void addErrors(String error) {
		this.errors.add(error);
		}
	
	private List<String> errors;
	
	 private String url;

	 @JsonFormat (shape=JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy hh:mm:ss")
	 private Date timestamp;
	  public ValidationError() {
			
		 this.timestamp=new Date();// TODO Auto-generated constructor stub
	this.errors=new ArrayList<>();
	  }
	 
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	 
}
