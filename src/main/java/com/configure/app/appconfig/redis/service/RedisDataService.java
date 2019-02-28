package com.configure.app.appconfig.redis.service;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisDataService implements IRedisDataServiceRepository {

	private int cacheExpirationSeconds = 60;

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	private HashOperations<String, Object, Object> hashOperations;
	
	private ValueOperations<String, Object> valueOperation;

	@PostConstruct
	private void init() {
		hashOperations = redisTemplate.opsForHash();

	}

	@Override
	public void putHash(String key, Object hashKey, Object value) {
		hashOperations.put(key, hashKey, value);
	}

	@Override
	public void putHash(String key, Object hashKey, Object value, int expirationSeconds) {
		hashOperations.put(key, hashKey, value);
		redisTemplate.expire(key, cacheExpirationSeconds, TimeUnit.SECONDS);
	}

	@Override
	public Object getHash(String key, Object hashKey) {

		return hashOperations.get(key, hashKey);
	}

}
