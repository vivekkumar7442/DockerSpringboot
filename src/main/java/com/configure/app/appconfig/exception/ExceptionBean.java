package com.configure.app.appconfig.exception;

/**
 * @author vivek
 *
 */
public class ExceptionBean {

	private String message;

	private Throwable cause;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}

}
