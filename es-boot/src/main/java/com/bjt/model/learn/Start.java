package com.bjt.model.learn;

public class Start {
	
	public static void main(String[] args) {
		Pancake roujiamo = new Roujiamo();
		roujiamo = new FireEgg(roujiamo);
		roujiamo = new Hum(roujiamo);
		System.err.println(roujiamo.price());
		System.err.println(roujiamo.getDesc());
		
	}

}
