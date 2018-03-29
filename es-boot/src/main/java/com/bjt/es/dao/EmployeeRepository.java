package com.bjt.es.dao;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import com.bjt.es.entity.Employee;


@Component
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String>{
	
	public  Employee queryEmployeeById(String id);  
	

}
