package com.cloud.client.annotion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
	
   public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("3");
		list.add("2");
		list.add("4");
		list.add("5");
		System.err.println(list);
		list.forEach( a ->{
			System.err.println(a+"a");;
		});
		
		List<String> a = list.stream().filter((s)->{ return s.startsWith("1");}).collect(Collectors.toList());
//		list.sort((x,y)->{
//			return x.compareTo(y);
//		});
		
		list.stream().sorted((x,y)->x.compareTo(y));
		
		
		System.err.println(a);
		
		System.err.println(list);
	}
	

}
