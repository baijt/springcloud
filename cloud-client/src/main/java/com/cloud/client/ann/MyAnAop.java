package com.cloud.client.ann;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Service;

import com.cloud.client.annotion.MyAn;


@Aspect
@Service
public class MyAnAop implements Ordered{
	
	@Pointcut("@annotation(com.cloud.client.annotion.MyAn)")
	public void pointCut(){
		
	}

	
	@Before("pointCut()")
	public void beforeAction(JoinPoint  joinPoint) throws NoSuchMethodException, SecurityException{
		
		joinPoint.getClass().getAnnotations();
		Class[] parameterTypes = ((MethodSignature) joinPoint.getSignature()).getMethod().getParameterTypes();
		System.err.println(joinPoint.getSignature().getDeclaringType());
		Method method  = joinPoint.getTarget().getClass().getMethod(joinPoint.getSignature().getName(), parameterTypes);
		MyAn an= method.getAnnotation(MyAn.class);
		if (an.type().equals("name1")) {
			System.err.println("hahhahhhhhhh");
		}
		
	}


	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}
