package com.configure.app.appconfig.redis.service;

public interface IRedisDataServiceRepository {

	public void putHash(String key, Object hashKey, Object value);

	public void putHash(String key, Object hashKey, Object value, int expirationSeconds);

	public Object getHash(String key, Object hashKey);
	
	
	

}
