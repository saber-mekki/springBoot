package com.example.jpa.error;

import org.springframework.http.HttpStatus;

public class NotFoundExeption extends ApiBaseException{

	public NotFoundExeption(String message)
	{
		super(message);
	}	
	@Override
	public HttpStatus getStatusCode() {
	return HttpStatus.NOT_FOUND;
	}
}
