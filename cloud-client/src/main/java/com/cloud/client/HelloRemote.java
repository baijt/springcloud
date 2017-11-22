package com.cloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "hellword-service",fallback=ComputeClientHystrix.class)
public interface HelloRemote {
	@RequestMapping(value = "/home")
    public String hello();

}
