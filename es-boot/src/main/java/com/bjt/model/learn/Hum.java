package com.bjt.model.learn;

import java.math.BigDecimal;

public class Hum  extends Condiment{

	private Pancake pancake;
	
	
	public Hum(Pancake pancake) {
		this.pancake = pancake;
	}

	@Override
	public String getDesc() {
		return pancake.getDesc()+"面包片,";
	}

	@Override
	public BigDecimal price() {
		return pancake.price().add(new BigDecimal(1.5));
	}

}
