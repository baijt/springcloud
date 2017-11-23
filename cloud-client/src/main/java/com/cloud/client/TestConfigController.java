package com.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigController {
	
	@Value("${neo.hello}")
	private String name;
	
	@RequestMapping("/config")
    public String from() {
        return this.name;
	}

}
