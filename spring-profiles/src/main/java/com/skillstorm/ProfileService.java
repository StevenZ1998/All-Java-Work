package com.skillstorm;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements InitializingBean{
	
	@Value("${steven.message.text}") // (SPel) SpringExpressionLanguage (This is pulled from the application.yml)
	private String example;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(example);
	}
	
}
