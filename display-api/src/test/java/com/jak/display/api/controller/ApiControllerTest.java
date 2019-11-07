package com.jak.display.api.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jak.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApiControllerTest {
	
	@Autowired
	ApiController apiController;
	
	@Test
	public void test() {
		System.out.println(apiController);
	}

}
