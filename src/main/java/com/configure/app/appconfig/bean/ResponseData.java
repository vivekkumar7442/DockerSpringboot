package com.configure.app.appconfig.bean;

import java.io.Serializable;

public class ResponseData<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2660267837607313030L;
	private final String message;
	private final String status;
	private T data;
	public static final String R_MSG_EMPTY = "";
	public static final Integer R_CODE_OK = 200;
	public static final Integer R_CODE_ERROR = 500;
	public static final Integer R_CODE_NOT_FOUND = 404;
	public static final Integer R_CODE_BAD_REQUEST = 400;
	public static final Integer R_CODE_INTERNAL_SERVER_ERROR = 500;
	public static final Integer R_CODE_UNAUTH_ERROR = 401;
	public static final Integer R_CODE_FORBIDDEN_ERROR = 403;
	public static final String RES_SUCCESS = "OK";
	public static final String RES_FAILURE = "OPERATION FAILED";
	public static final String RES_NO_DATA = "NO DATA";

	public ResponseData() {
		this.message = ResponseData.R_MSG_EMPTY;
		this.status = "Success";
		this.setData(data);

	}

	public ResponseData(final Integer code, final String message, T data, final String status) {
		this.message = message == null ? ResponseData.R_MSG_EMPTY : message;
		this.status = status == null ? "Failure" : status;
		this.setData(data);
	}

	public ResponseData(T data) {
		this.message = ResponseData.R_MSG_EMPTY;
		this.data = data;
		this.status = "Success";
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public String getStatus() {
		return status;
	}

}
