package com.ass.emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConfig {
	
	@Bean
	public RestTemplate getInstance() {
		
		 return new RestTemplate();
	}

}
