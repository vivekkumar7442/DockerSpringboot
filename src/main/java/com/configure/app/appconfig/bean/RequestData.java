package com.configure.app.appconfig.bean;

import java.util.List;

public class RequestData {
	
	
	private String key;
	
	private String hashKey;
	
	private List<Integer> userId;
	
	
	
	
	
	public List<Integer> getUserId() {
		return userId;
	}


	public void setUserId(List<Integer> userId) {
		this.userId = userId;
	}


	private String value;
	
	
	private Object data;


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getHashKey() {
		return hashKey;
	}


	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}
	
	
	
	

}
