package com.skillstorm.rest;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.skillstorm.beans.Department;

@Component
public class ApiConsumer {
	
	private static final String URL = "http://localhost:8081/";
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public Department getD(int id) throws RestClientException, URISyntaxException {
		Department department = restTemplate.getForObject(new URI(URL + "departments/" + id), Department.class);
		System.out.println(department);
		return department;
	}
	
}
