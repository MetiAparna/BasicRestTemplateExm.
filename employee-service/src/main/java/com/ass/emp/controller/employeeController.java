package com.ass.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class employeeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/emp")
	public String getEmployee() {
		
		String address=restTemplate.getForObject("http://localhost:8081/address", String.class);
		
		return "Ename:ram,email:ram@gmail.com,sal:1000000 "+address;
	}

}
