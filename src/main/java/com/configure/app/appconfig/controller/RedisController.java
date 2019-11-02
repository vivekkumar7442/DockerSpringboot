package com.configure.app.appconfig.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.concurrent.ExecutionException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.configure.app.appconfig.bean.RequestData;
import com.configure.app.appconfig.bean.ResponseResources;
import com.configure.app.appconfig.entity.Address;
import com.configure.app.appconfig.entity.User;
import com.configure.app.appconfig.entity.UserRepository;
import com.configure.app.appconfig.redis.service.IRedisDataServiceRepository;

/**
 * @author vivek
 * 
 * this class is used for Testing purpose of redis storage and Retrival
 *
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

	@Autowired
	IRedisDataServiceRepository iRedisDataServiceRepository;

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RestTemplate restTemplate;

	/**
	 * @author vivek
	 * @param key
	 * @param keyValue
	 * @return
	 */
	@RequestMapping(value = "/value", method = RequestMethod.GET)
	public ResponseResources<RequestData> getRedisValue(@RequestParam(value = "key") String key,
			@RequestParam(value = "keyValue") String keyValue) {
		RequestData data = new RequestData();
		Object object = iRedisDataServiceRepository.getHash(key, keyValue);
		data.setData(object);

		return new ResponseResources<RequestData>(ResponseResources.R_CODE_OK, ResponseResources.RES_SUCCESS, data, "Success");

	}

	/**
	 * @author vivek
	 * @param requestData
	 * @return
	 */
	@RequestMapping(value = "/values", method = RequestMethod.POST)
	public ResponseResources getRedisValue(@RequestBody RequestData requestData) {
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

		return new ResponseResources<>();

	}

	/**
	 * 
	 * @param <T>
	 * @param requestData
	 * @return
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@Transactional
	public @ResponseBody <T> ResponseResources getUserData() {
		ResponseEntity<String> h = restTemplate
				.getForEntity("http://164.100.128.10/mfmsReports/getProductWiseStockAsOnDate", String.class);
		//HTML h1=	h.getBody();

		//Document d = Jsoup.parse(h.toString());
		FileWriter fWriter = null;
		BufferedWriter writer = null;
		try {
		    fWriter = new FileWriter("fileName.html");
		    writer = new BufferedWriter(fWriter);
		    writer.write(h.getBody());
		    writer.newLine(); //this is not actually needed for html files - can make your code more readable though 
		    writer.close(); //make sure you close the writer object 
		} catch (Exception e) {
		  //catch any exceptions here
		}

		return null;

	}

}
