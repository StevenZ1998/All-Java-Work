package com.skillstorm;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestClientException;

import com.skillstorm.rest.ApiConsumer;

@SpringBootTest
class SpringBootConsumerApplicationTests {
	
	@Autowired
	private ApiConsumer consumer;
	
	@Test
	void apiTest() {
		try {
			consumer.getD(1);
		} catch (RestClientException | URISyntaxException e) {
			System.out.println("Something is wrong.");
			e.printStackTrace();
		}
	}

}
