package com.cloud.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	@Autowired
    RestTemplate restTemplate;
	 
	
	@Autowired
	HelloRemote helloRemote;
	
	private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/name")
    public String hi(){
		long time1 = System.currentTimeMillis();
        String result = restTemplate.getForObject("http://hellword-service/home", String.class);
        logger.info("time ={}",System.currentTimeMillis()-time1);
        return result;
    }
	
	
	@RequestMapping("/hello")
    public String hello(){
		long time1 = System.currentTimeMillis();
        String result = helloRemote.hello();
        logger.info("time ={}",System.currentTimeMillis()-time1);
        return result;
    }

}
