package com.bjt.model.learn;

import java.math.BigDecimal;

public class FireEgg  extends Condiment {

	
	private Pancake pancake;
	
	
	public FireEgg(Pancake pancake) {
		this.pancake = pancake;
	}

	@Override
	public String getDesc() {
		
		return pancake.getDesc()+"煎蛋,";
	}

	@Override
	public BigDecimal price() {
		
		return pancake.price().add(new BigDecimal(2));
	}

}
