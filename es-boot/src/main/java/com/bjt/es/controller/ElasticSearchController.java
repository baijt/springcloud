package com.bjt.es.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bjt.es.dao.EmployeeRepository;
import com.bjt.es.entity.Employee;


@RestController
@RequestMapping("/es")  
public class ElasticSearchController {
	
	@Autowired
	private EmployeeRepository er;
	
	@RequestMapping("/add/{id}")
	public String add(@PathVariable("id")String id){
		Employee employee=new Employee();  
        employee.setId(id);  
        employee.setFirstName("xuxu");  
        employee.setLastName("zh");  
        employee.setAbout("i am in peking");  
        er.save(employee);  
        System.err.println("add a obj");  
        return "success";  
		
	}
	
    //查询  
    @RequestMapping("/query")  
    public Employee  query(){  
          
//    	Iterable<Employee> accountInfos =  er.findAll();
    	long time0 = System.currentTimeMillis();
        Employee accountInfo=er.queryEmployeeById("1");  
        System.err.println(System.currentTimeMillis() -time0);
        System.err.println(er.toString());  
  /*      Iterator iter = accountInfos.iterator();
        while (iter.hasNext()) {
			System.err.println(iter.next().toString());
			
		}*/
        
          
        return accountInfo;  
    } 

}
