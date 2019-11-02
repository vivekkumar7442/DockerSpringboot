package com.configure.app.appconfig.exception;

/**
 * @author vivek
 *
 */
public class BaseException extends Exception {

	public BaseException(String message) {
		super(message);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public BaseException(ExceptionHandler exceptionHandler) {
		super(exceptionHandler.getExceptionBean().getMessage(),exceptionHandler.getExceptionBean().getCause());
	}

}
