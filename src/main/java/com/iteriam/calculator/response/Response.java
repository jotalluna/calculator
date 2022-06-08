package com.iteriam.calculator.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Response {
	
	public static final int NO_ERROR=0;
	public static final int WRONG_PARAM=101;
	
	
	public static final String NO_MESSAGE="";
	private Error error;
	
	@Data
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	static class Error{
		private long errorCode;
		private String message;
	}
	
	public static Response noErrorCode() {
		return new Response(new Error(NO_ERROR,NO_MESSAGE));
	}
	
	public static Response errorCode(int errorCode, String errorMessage) {
		return new Response(new Error(errorCode,errorMessage));
	}
	
	

}
