package com.configure.app.appconfig.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.configure.app.appconfig.bean.RequestData;
import com.configure.app.appconfig.bean.ResponseData;
import com.configure.app.appconfig.bean.UserBean;
import com.configure.app.appconfig.entity.Address;
import com.configure.app.appconfig.entity.User;
import com.configure.app.appconfig.entity.UserRepository;
import com.configure.app.appconfig.redis.service.IRedisDataServiceRepository;

@RestController
@RequestMapping("/redis")
public class RedisController {

	@Autowired
	IRedisDataServiceRepository iRedisDataServiceRepository;

	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "/value", method = RequestMethod.GET)
	public ResponseData<RequestData> getRedisValue(@RequestParam(value = "key") String key,
			@RequestParam(value = "keyValue") String keyValue) {
		RequestData data = new RequestData();
		Object object = iRedisDataServiceRepository.getHash(key, keyValue);
		data.setData(object);

		return new ResponseData<RequestData>(data);

	}

	@RequestMapping(value = "/values", method = RequestMethod.POST)
	public ResponseData getRedisValue(@RequestBody RequestData requestData) {
		for (int i = 0; i < 100000; i++) {
			User user = userRepository.findById(4).get();

			User user2 = new User();
			user2.setFirstName("sam" + i);
			user2.setLastName("anand");
			user2.setUserName("sam anderson");
			Address address = new Address();
			address.setAddress("Chennai");
			user2.getAddresses().add(address);
			userRepository.saveAndFlush(user2);
		}

		iRedisDataServiceRepository.putHash(requestData.getHashKey(), requestData.getKey(), requestData.getData());

		return new ResponseData<>();

	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@Transactional
	public @ResponseBody ResponseData getUserData(@RequestBody RequestData requestData)
			throws InterruptedException, ExecutionException {
		ResponseData data = new ResponseData<>();

	
		
		List<User> users=userRepository.findAll(getTaskFilter(null, null, null, null));

		List<UserBean> response = users.stream().map(UserBean::new).collect(Collectors.toList());
		System.currentTimeMillis();

		return new ResponseData(response);

	}
	
	List<User> getUser(Integer i){
	return	userRepository.findAll( PageRequest.of( i, 10)).getContent();

		
	}
	
public CompletableFuture<List<User>> calculateAsync(){
	CompletableFuture<List<User>> completableFuture=new CompletableFuture<>();
	completableFuture.supplyAsync(() ->userRepository.findAll());

	return completableFuture;
}

	public static final Specification<User> getTaskFilter(final String groupName, final List<String> status,
			String userName, Integer serviceId) {
		return new Specification<User>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				final List<Predicate> predicates = new ArrayList<>();
				return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
	}

}
