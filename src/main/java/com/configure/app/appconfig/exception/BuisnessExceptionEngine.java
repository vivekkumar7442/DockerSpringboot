package com.configure.app.appconfig.exception;

public class BuisnessExceptionEngine implements IExceptionEngine{
	
	private IExceptionEngine exceptionEngine;


	@Override
	public void setNextEngine(IExceptionEngine exceptionEngine) {
		this.exceptionEngine=exceptionEngine;

		
	}

	@Override
	public ExceptionBean process(String messageCode, Throwable cause) {
		// TODO Auto-generated method stub
		return null;
	}

}
