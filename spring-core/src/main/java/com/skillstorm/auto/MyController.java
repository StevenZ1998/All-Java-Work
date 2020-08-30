package com.skillstorm.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	@Autowired
	@Qualifier("serviceservice") // Autowire byName, default - autowire by type.
	private MyService service;
	
	public MyService getService() {
		return service;
	}
	
}
