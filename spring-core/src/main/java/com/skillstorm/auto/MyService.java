package com.skillstorm.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "serviceservice")
public class MyService {
	
	@Autowired
	private MyDao dao;
	
	@Autowired
	private MyUtensil u;
	
}
