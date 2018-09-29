package com.appvengers.seoulapp.exception;

public class SeoupAppException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SeoupAppException( String message ) {
		super( message );
	}
	
	public SeoupAppException( String message, Throwable exception ) {
		super( message, exception);
	}
}
