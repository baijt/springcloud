package com.cloud.client.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({
	ElementType.METHOD,ElementType.FIELD,ElementType.PARAMETER
})

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAn {
	
	public String type();

}
