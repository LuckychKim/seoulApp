package com.appvengers.seoulapp.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger( GlobalDefaultExceptionHandler.class );
	
	@ExceptionHandler( value = Exception.class )
	public ResponseEntity<Map<String, String>> defaultErrorHandler(HttpServletRequest request, Exception e){
		
		printErrorMessage(request, e);
		
		Map<String, String> error = new HashMap<>();
		error.put("success", "false");
		error.put("url", request.getRequestURI());
		
		return new ResponseEntity<Map<String,String>>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	private void printErrorMessage(HttpServletRequest req, Exception e) {
		StringBuilder errorMsg = new StringBuilder();
		
		errorMsg.append("Error Info : Request URL [" + req.getRequestURL() + "]").append(", ")
				.append("Error Message [" + e.getMessage() + "]");
		LOGGER.error( errorMsg.toString(), e);
	}
}
