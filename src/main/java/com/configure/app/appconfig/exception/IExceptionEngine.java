package com.configure.app.appconfig.exception;

public interface IExceptionEngine {
	
	public void setNextEngine(IExceptionEngine exceptionEngine);

	public ExceptionBean process(String messageCode,Throwable cause);

}
