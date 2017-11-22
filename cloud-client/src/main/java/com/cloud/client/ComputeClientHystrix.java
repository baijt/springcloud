package com.cloud.client;

import org.springframework.stereotype.Component;

@Component
public class ComputeClientHystrix  implements HelloRemote{

	@Override
	public String hello() {
		
		return "error";
	}

}
