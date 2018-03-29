package com.bjt.model.learn;

import java.math.BigDecimal;

public class Roujiamo extends Pancake{
	
	

	public Roujiamo() {
		desc= "肉夹馍";
	}

	@Override
	public BigDecimal price() {
		return new BigDecimal(8);
	}

}
