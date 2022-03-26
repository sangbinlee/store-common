package com.sodi.store.common.service;

import static org.junit.Assert.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootTest("service.message=Hello")
public class MyServiceTest {

	@Autowired
	private MyService myService;

	@Test
	public void contextLoads() {
		assertThat(myService.message()).isNotNull();
	}

	@SpringBootApplication
	static class TestConfiguration {
	}

}