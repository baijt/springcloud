package com.cloud.client.ann;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;



@Aspect
@Service

public class TestLogAop implements Ordered{

	private Logger log = LoggerFactory.getLogger(TestLogAop.class);
	
	
	@Pointcut("execution(* com.cloud.client.*Controller.*(..))")
	public void piontCut(){
		
	};
	
	@Around("piontCut()")
	public Object arroundLog(ProceedingJoinPoint proceedingJoinPoints) throws Throwable{
		
		log.info("---------------------");
		Object result = proceedingJoinPoints.proceed();
		log.info("================");
		return result;
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

}
