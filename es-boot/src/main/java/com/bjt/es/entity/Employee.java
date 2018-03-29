package com.bjt.es.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Document(indexName = "es01",type = "employee", shards = 1,replicas = 0, refreshInterval = "-1") 	
public class Employee {
	
	@Id
	private String id;
	
	@Field(type=FieldType.String)
	private String firstName;
	
	@Field(type=FieldType.String)
	private String lastName;
	
	@Field(type=FieldType.String)
	private String about;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", about=" + about + "]";
	}
	
	

}
