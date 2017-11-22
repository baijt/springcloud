package com.cloud.first.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {
	
	@ResponseBody
	@RequestMapping(value ="/home")
	public String  home(){
		return "陕西.宝鸡.扶风";
	}

	
}
