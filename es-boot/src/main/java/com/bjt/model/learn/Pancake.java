package com.bjt.model.learn;

import java.math.BigDecimal;

public  abstract class Pancake {
	
	public String desc ="我是一个普通的煎饼";
	
	public String getDesc(){
		return desc;
	}
	
	public abstract BigDecimal price();

}
