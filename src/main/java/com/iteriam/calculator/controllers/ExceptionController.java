package com.iteriam.calculator.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.iteriam.calculator.response.Response;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler
	public ResponseEntity<Response>handleException(Exception exception){
		
		Response response=Response.errorCode(Response.WRONG_PARAM, exception.getMessage());
		return new ResponseEntity<Response>(response,HttpStatus.BAD_REQUEST);		
	}	

}
